package Object_oriented1;

/**
 * Created by bobsang89@gmail.com on 2018-12-20
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class CallStackTest {
    public static void main(String[] args) {
        System.out.println("mainMethod start");
        firstMethod();
        System.out.println("mainMethod done");
    }
    static void firstMethod(){
        System.out.println("firstMethod start");
        secondMethod();
        System.out.println("firstMethod done");
    }
    static void secondMethod(){
        System.out.println("secondMethod start");
        thirdMethod();
        System.out.println("secondMethod done");
    }
    static void thirdMethod(){
        System.out.println("thirdMethod start");
        System.out.println("thirdMethod done");
    }
}
