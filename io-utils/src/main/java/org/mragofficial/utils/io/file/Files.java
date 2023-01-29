package org.mragofficial.utils.io.file;

import java.io.File;
import java.util.regex.Pattern;

public final class Files {
    /**
     * 合法文件后缀名
     */
    public static final Pattern EXT_PATTERN = Pattern.compile("\\w+");

    /**
     * 本机临时目录
     */
    public static final File TMPDIR = new File(System.getProperty("java.io.tmpdir"));

    /**
     * 获取一个临时文件
     *
     * @return 存放于系统临时目录的临时文件，文件名为`{@code tmp_{时间戳}}`
     */
    public static File tmpfile() {
        return tmpfile(null);
    }

    /**
     * 获取一个临时文件
     *
     * @param ext 指定的后缀名
     * @return 存放于系统临时目录的临时文件，文件名为`{@code tmp_{时间戳}.{ext}}`
     */
    public static File tmpfile(String ext) {
        File tmp = null;
        long millis = System.currentTimeMillis();
        try {
            do {
                String suffix = ext != null && EXT_PATTERN.matcher(ext).matches() ? "." + ext : "";
                tmp = new File("tmp_" + (millis++) + suffix);
            } while (!tmp.createNewFile());
            return tmp;
        } catch (Exception e) {
            throw new FileException("缓存文件创建失败: tmp=" + tmp, e);
        }
    }
}
