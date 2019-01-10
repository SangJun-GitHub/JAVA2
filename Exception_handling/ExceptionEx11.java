package Exception_handling;

/**
 * Created by bobsang89@gmail.com on 2019-01-09
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class ExceptionEx11 {
    public static void main(String[] args) {
        method1();
    }
    static void method1() {
        try{
            throw new Exception();
        } catch (Exception e){
            System.out.println("An exception was processed  in method1");
            e.printStackTrace();
        }
    }
}
