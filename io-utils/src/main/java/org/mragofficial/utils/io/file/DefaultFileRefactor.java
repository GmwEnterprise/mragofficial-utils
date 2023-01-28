package org.mragofficial.utils.io.file;

import java.io.InputStream;

public class DefaultFileRefactor implements FileRefactor {

    private final FileContext context;

    public DefaultFileRefactor(FileContext context) {
        this.context = context;
    }

    @Override
    public void rename(String name) {

    }

    @Override
    public void rename(String name, boolean withExt) {

    }

    @Override
    public void moveTo(String dir) {

    }

    @Override
    public void appendBits(InputStream input) {

    }

    @Override
    public void appendBits(byte[] bits) {

    }
}
