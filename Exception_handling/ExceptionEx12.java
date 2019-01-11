package Exception_handling;

/**
 * Created by bobsang89@gmail.com on 2019-01-10
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class ExceptionEx12 {
    public static void main(String[] args) {
        try{
            method1();
        }catch(Exception e){
            System.out.println("An exception was processed in main method");
            e.printStackTrace();
        }
    }
    static void method1() throws Exception{
        throw new Exception();
    }
}
