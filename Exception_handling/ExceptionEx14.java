package Exception_handling;

import java.io.File;

/**
 * Created by bobsang89@gmail.com on 2019-01-10
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class ExceptionEx14 {
    public static void main(String[] args) {
        try{
            File f = createFile(args[0]);
            System.out.println( f.getName() + " is successfully created");
        }catch (Exception e){
            System.out.println(e.getMessage() +  " please enter again");
        }
    }

    static File createFile(String fileName) throws Exception {
        if (fileName == null || fileName.equals(""))
            throw new Exception("The file name is invalid");
        File f = new File(fileName);
        f.createNewFile();
        return f;
    }
}
