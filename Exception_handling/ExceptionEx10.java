package Exception_handling;

/**
 * Created by bobsang89@gmail.com on 2019-01-09
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class ExceptionEx10 {
    public static void main(String[] args)throws Exception {
        method1();              //we can call static member without creating an instance because of in the same class
    }
    static void method1() throws Exception{
        method2();
    }
    static void method2() throws Exception{
        throw  new Exception();
    }
}
