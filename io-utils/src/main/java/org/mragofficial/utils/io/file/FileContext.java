package org.mragofficial.utils.io.file;

import java.io.InputStream;

public interface FileContext {

    String path();

    String ext();

    FileType type();

    long size();

    InputStream getInputStream();
}
