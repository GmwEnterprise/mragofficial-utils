package org.mragofficial.utils.io.file;

import java.io.*;

public class DefaultFileContext implements FileContext, FileRefactor {
    private File context;
    private long size;
    private String filename;
    private String path;
    private String ext;
    private FileRefactor defaultFileRefactor;

    public DefaultFileContext(File context) {
        this.context = context;
        analyzeContext();
        defaultFileRefactor = new DefaultFileRefactor(this);
    }

    @Override
    public String toString() {
        return String.format("File(name=%s,size=%s)", filename, size);
    }

    private void analyzeContext() {
        if (context == null) {
            throw new NullPointerException("context is null");
        }
        if (!context.exists()) {
            try {
                context.createNewFile();
            } catch (IOException e) {
                throw new FileContextException(this, "I/O error", e);
            } catch (SecurityException e) {
                throw new FileContextException(this, "security error", e);
            }
        }
        size = context.length();
        path = context.getAbsolutePath();
        filename = context.getName();
        ext = filename.indexOf(".") > 0 ?
                filename.substring(filename.lastIndexOf(".") + 1) : "";
    }

    @Override
    public String path() {
        return path;
    }

    @Override
    public String ext() {
        return ext;
    }

    @Override
    public FileType type() {
        return null;
    }

    @Override
    public long size() {
        return size;
    }

    @Override
    public InputStream getInputStream() {
        try {
            return new BufferedInputStream(new FileInputStream(context));
        } catch (FileNotFoundException e) {
            throw new FileContextException(this, "文件未找到", e); // FIXME 如何处理这个异常
        }
    }

    @Override
    public void rename(FileContext context, String name) {
        defaultFileRefactor.rename(context, name);
    }

    @Override
    public void rename(FileContext context, String name, boolean withExt) {
        defaultFileRefactor.rename(context, name, withExt);
    }

    @Override
    public void moveTo(FileContext context, String dir) {
        defaultFileRefactor.moveTo(context, dir);
    }

    @Override
    public void appendBits(FileContext context, InputStream input) {
        defaultFileRefactor.appendBits(context, input);
    }

    @Override
    public void appendBits(FileContext context, byte[] bits) {
        defaultFileRefactor.appendBits(context, bits);
    }
}
