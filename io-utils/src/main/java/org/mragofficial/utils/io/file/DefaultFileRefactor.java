package org.mragofficial.utils.io.file;

import java.io.InputStream;

public class DefaultFileRefactor implements FileRefactor {

    private final FileContext context;

    public DefaultFileRefactor(FileContext context) {
        this.context = context;
    }

    @Override
    public void rename(FileContext context, String name) {

    }

    @Override
    public void rename(FileContext context, String name, boolean withExt) {

    }

    @Override
    public void moveTo(FileContext context, String dir) {

    }

    @Override
    public void appendBits(FileContext context, InputStream input) {

    }

    @Override
    public void appendBits(FileContext context, byte[] bits) {

    }
}
