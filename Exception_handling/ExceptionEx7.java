package Exception_handling;

/**
 * Created by bobsang89@gmail.com on 2019-01-08
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class ExceptionEx7 {
    public static void main(String[] args) {
        try{
            Exception e = new Exception("Intentional occurrence.");
            throw e;
            //throw new Exception("Intentional occurrence");
        } catch(Exception e){
            System.out.println("Error message : " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("The program terminated normally.");
    }
}
