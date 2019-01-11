package Exception_handling;

import java.io.*;

/**
 * Created by bobsang89@gmail.com on 2019-01-10
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class ExceptionEx13 {
    public static void main(String[] args) {
        File f = createFile(args[0]);
        System.out.println(f.getName() + " is successfully created");
    }
    static File createFile(String fileName){
        try{
            if (fileName == null || fileName.equals(""))
                throw new Exception("The file name is invalid");
        }catch(Exception e){
            fileName = "untitled.txt";
        }finally {
            File f = new File(fileName);
            createNewFile(f);
            return f;
        }
    }
    static void createNewFile(File f){
        try{
            f.createNewFile();
        }catch(Exception e){

        }
    }
}
