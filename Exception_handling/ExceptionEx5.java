package Exception_handling;

/**
 * Created by bobsang89@gmail.com on 2019-01-08
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class ExceptionEx5 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0/0);
            System.out.println(4);
        } catch (ArithmeticException ae){
            if(ae instanceof ArithmeticException)
                System.out.println("true");
            System.out.println("ArithmeticException");
        } catch (Exception e){
            System.out.println("Exception");
        }
        System.out.println(6);
    }
}
