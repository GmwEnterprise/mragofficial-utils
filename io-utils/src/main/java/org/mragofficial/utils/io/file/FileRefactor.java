package org.mragofficial.utils.io.file;

import java.io.InputStream;

public interface FileRefactor {

    void rename(FileContext context, String name);

    void rename(FileContext context, String name, boolean withExt);

    void moveTo(FileContext context, String dir);

    void appendBits(FileContext context, InputStream input);

    void appendBits(FileContext context, byte[] bits);
}
