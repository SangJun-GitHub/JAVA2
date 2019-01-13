package Exception_handling;

/**
 * Created by bobsang89@gmail.com on 2019-01-13
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class FinallyTest3 {
    public static void main(String[] args) {
        //method1() is static method, so we can call without creating instance
        FinallyTest3.method1();
        System.out.println("method1() was done then come back to main");
    }

    static void method1(){
        try{
            System.out.println("method1() was called");
            return;
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("method1()'s finally block was run");
        }
    }
}
