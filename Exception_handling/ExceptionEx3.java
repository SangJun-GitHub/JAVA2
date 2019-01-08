package Exception_handling;

/**
 * Created by bobsang89@gmail.com on 2019-01-07
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class ExceptionEx3 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try{
            System.out.println(3);
            System.out.println(4);
        }catch(Exception e){
            System.out.println(5);
        }
        System.out.println(6);
    }
}
