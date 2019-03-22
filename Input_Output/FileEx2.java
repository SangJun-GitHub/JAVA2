package Input_Output;

import java.io.File;

/**
 * Created by bobsang89@gmail.com on 2019-03-21
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class FileEx2 {
    public static void main(String[] args) {
        if(args.length != 1){
            System.out.println("USAGE : java FileEx2 DIRECTORY");
            System.exit(0);
        }

        File file = new File(args[0]);

        if(!file.exists() || !file.isDirectory()){
            System.out.println("Invalid directory.");
            System.exit(0);
        }

        File[] files = file.listFiles();

        for(int i = 0; i < files.length; i++){
            String fileName = files[i].getName();
            System.out.println(files[i].isDirectory() ? "[" + fileName + "]" : fileName);
        }
    }
}
