package org.mragofficial.utils.io.file;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

class FileContextTests {

    @Test
    void testJavaIoFile() {
        File file = new File(".....");
        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());
    }

    @Test
    void testFileCreate() throws IOException {
        File tempDir = new File(System.getProperty("java.io.tmpdir"));
        // 指定文件夹中创建文件
        File file = new File(tempDir, "123456");
        if (!file.exists()) {
            System.out.printf("create new file: %s\n", file.createNewFile());
        }
        System.out.println(file);
    }

    @Test
    void testFileContextInitialization() {
        String path = "C:\\Users\\Gmw\\OneDrive\\同步的图片\\201807011113128645.jpg";
        FileContext context = new DefaultFileContext(new File(path));
        System.out.println(context);
    }
}
