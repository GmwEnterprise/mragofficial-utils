package org.mragofficial.utils.io.file;

import java.io.InputStream;

public interface FileRefactor {

    void rename(String name);

    void rename(String name, boolean withExt);

    void moveTo(String dir);

    void appendBits(InputStream input);

    void appendBits(byte[] bits);
}
