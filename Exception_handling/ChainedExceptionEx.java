package Exception_handling;

/**
 * Created by bobsang89@gmail.com on 2019-01-14
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class ChainedExceptionEx {
    public static void main(String[] args) {
        try {
            install();
        } catch (InstallException2 e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void install() throws InstallException2 {
        try {
            startInstall();
            copyFiles();
        } catch (SpaceException e) {
            InstallException2 ie = new InstallException2("Exception occur!!");
            ie.initCause(e);
            throw ie;
        } catch (MemoryException me) {
            InstallException2 ie = new InstallException2("Exception occur!!");
            ie.initCause(me);
            throw ie;
        } finally {
            deleteTempFiles();
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

class InstallException2 extends Exception{
    InstallException2(String msg){
        super(msg);
    }
}
