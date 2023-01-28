package org.mragofficial.utils.io.file;

public interface TextRefactor {

    void appendText(String text);

    void insertText(String text, long startIndex);

    void deleteText(long startIndex, long endIndex);

    void replaceText(long startIndex, long endIndex, String content);
}
