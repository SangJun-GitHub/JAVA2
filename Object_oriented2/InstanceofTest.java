package Object_oriented2;

/**
 * Created by bobsang89@gmail.com on 2018-12-30
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class InstanceofTest {
    public static void main(String[] args) {
        FireEngine fe = new FireEngine();

        if(fe instanceof FireEngine)
            System.out.println("This is a FireEngine instance.");

        if(fe instanceof  Car)
            System.out.println("This is a Car instance");

        if(fe instanceof Object)
            System.out.println("This is an Object instance");

        System.out.println(fe.getClass().getName());
    }
}
