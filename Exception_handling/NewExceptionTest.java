package Exception_handling;

/**
 * Created by bobsang89@gmail.com on 2019-01-13
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
class SpaceException extends Exception {
    SpaceException(String msg){
        super(msg);
    }
}
class MemoryException extends Exception {
    MemoryException(String msg){
        super(msg);
    }
}
public class NewExceptionTest {
    public static void main(String[] args) {
        try{
            startInstall();         //prepare to install a program
            copyFiles();            //copy files
        }catch (SpaceException se){
            System.out.println("Error message : " + se.getMessage());
            se.printStackTrace();
            System.out.println("Try again to install after getting enough space");
        }catch (MemoryException me){
            System.out.println("Error message : " + me.getMessage());
            me.printStackTrace();
            System.gc();
            System.out.println("Try again to install");
        }finally {
            deleteTempFiles();      //delete temp files for installing
        }
    }

    static void startInstall()throws SpaceException, MemoryException{
        if(!enoughSpace())
            throw new SpaceException("Not enough space to install");
        if(!enoughMemory())
            throw new MemoryException("Not enough memory to install");
    }

    static void copyFiles(){/* write code for copying files*/}
    static void deleteTempFiles(){/*write code for removing a template file*/}
    static boolean enoughSpace(){
        /*write code to check enough space to install*/
        return false;
    }
    static boolean enoughMemory(){
        /*write code to check enough memory to install*/
        return true;
    }
}
