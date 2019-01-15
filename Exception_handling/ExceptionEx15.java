package Exception_handling;

/**
 * Created by bobsang89@gmail.com on 2019-01-14
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class ExceptionEx15 {
    public static void main(String[] args) {
        try{
            method1();
        }catch(Exception e){
            System.out.println("An exception was processed in main method");
        }
    }
    static void method1() throws Exception {
        try{
            throw new Exception();
        }catch(Exception e){
            System.out.println("An exception was processed in method1() method");
            throw e;
        }
    }
}
