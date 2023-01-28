package org.mragofficial.utils.io.file;

public class FileContextException extends RuntimeException {

    public FileContextException(FileContext context, String message) {
        super(String.format("errMsg=%s, context=%s", message, context));
    }

    public FileContextException(FileContext context, String message, Throwable cause) {
        super(String.format("errMsg=%s, context=%s", message, context), cause);
    }
}
