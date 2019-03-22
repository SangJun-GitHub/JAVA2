package Input_Output;

import java.io.File;
import java.util.ArrayList;

/**
 * Created by bobsang89@gmail.com on 2019-03-21
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class FileEx3 {
    static int totalFiles = 0;
    static int totalDirs = 0;

    public static void main(String[] args) {
        if(args.length != 1){
            System.out.println("USAGE : java FileEx2 DIRECTORY");
            System.exit(0);
        }

        File dir = new File(args[0]);
        if(!dir.exists() || !dir.isDirectory()){
            System.out.println("Invalid directory.");
            System.exit(0);
        }

        printFileList(dir);

        System.out.println();
        System.out.println("Total files : " + totalFiles);
        System.out.println("Total directories : " + totalDirs);
    }

    public static void printFileList(File dir){
        System.out.println(dir.getAbsolutePath() + "directory");
        File[] files = dir.listFiles();

        ArrayList subDir = new ArrayList();

        for(int i = 0; i < files.length; i++){
            String filename = files[i].getName();

            if(files[i].isDirectory()) {
                filename = "[" + filename + "]";
                subDir.add(i + "");
            }
                System.out.println(filename);
        }

            int dirNum = subDir.size();
            int fileNum = files.length - dirNum;

            totalFiles += fileNum;
            totalDirs += dirNum;

            System.out.println(fileNum + " files, " + dirNum + " directories");
            System.out.println();

            for(int i = 0; i < subDir.size(); i++){
                int index = Integer.parseInt((String)subDir.get(i));
                printFileList(files[index]);
            }

    }
}
