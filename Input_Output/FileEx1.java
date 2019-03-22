package Input_Output;

import java.io.File;
import java.io.IOException;

/**
 * Created by bobsang89@gmail.com on 2019-03-21
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class FileEx1 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\JAVA2\\src\\Input_Output\\FileEx1.java");
        String fileName = file.getName();
        int pos = fileName.lastIndexOf(".");

        System.out.println("File name without path - " + file.getName());
        System.out.println("File name without extension - " + fileName.substring(0,pos));
        System.out.println("Extension - " + fileName.substring(pos + 1));

        System.out.println("File name with path - " + file.getPath());
        System.out.println("Absolute path - " + file.getAbsolutePath());
        System.out.println("Canonical path - " + file.getCanonicalPath());
        System.out.println("file belongs directory - " + file.getParent());
        System.out.println();
        System.out.println("File.pathSeparator - " + File.pathSeparator);
        System.out.println("File.pathSeparatorChar - " + File.pathSeparatorChar);
        System.out.println("File.separator - " + File.separator );
        System.out.println("File.separatorChar - " + File.separatorChar);
        System.out.println();
        System.out.println("user.dir=" + System.getProperty("user.dir"));
        System.out.println("sun.boot.class.path=" + System.getProperty("sun.boot.class.path"));
    }
}
