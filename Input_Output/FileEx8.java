package Input_Output;

import java.io.File;

/**
 * Created by bobsang89@gmail.com on 2019-03-23
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class FileEx8 {
    static int deletedFiles = 0;

    public static void main(String[] args) {
        if(args.length != 1) {
            System.out.println("USAGE : java FileEx8 Extension");
            System.exit(0);
        }

        String currDir = System.getProperty("user.dir");

        File dir = new File(currDir);
        String extension = "." + args[0];

        delete(dir, extension);
        System.out.println(deletedFiles + "many files deleted");
    }

    public static void delete(File dir, String extension){
        File[] files = dir.listFiles();

        for(int i = 0; i < files.length; i++){
            if(files[i].isDirectory()){
                delete(files[i], extension);
            }else{
                String fileName = files[i].getAbsolutePath();

                if(fileName.endsWith(extension)){
                    System.out.print(fileName);
                    if(files[i].delete()){
                        System.out.println(" - deleting success");
                        deletedFiles++;
                    }else {
                        System.out.println(" - deleting failed");
                    }
                }
            }
        }
    }
}
