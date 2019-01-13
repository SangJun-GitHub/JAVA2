package Exception_handling;

/**
 * Created by bobsang89@gmail.com on 2019-01-13
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class FinallyTest2 {
    public static void main(String[] args) {
        try {
            startInstall();
            copyFiles();
        } catch(Exception e){
            e.printStackTrace();
        } finally {
            deleteTempFiles();
        }
    }
    static void startInstall(){/* write code for install the program */}
    static void copyFiles(){/* write code for copying files*/}
    static void deleteTempFiles(){/*write code for removing a template file */}
}
