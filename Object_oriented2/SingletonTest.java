package Object_oriented2;

/**
 * Created by bobsang89@gmail.com on 2018-12-28
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
final class Singleton {
    private static Singleton s = new Singleton();

    private  Singleton(){
        //
    }

    public static Singleton getInstance(){
        if(s==null)
            s= new Singleton();
        return s;
    }
}
public class SingletonTest {
    public static void main(String[] args) {
//        Singleton s = new Singleton();    //error. Singleton() has private access in Singleton
        Singleton s = Singleton.getInstance();
    }
}
