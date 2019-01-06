package Object_oriented2;

/**
 * Created by bobsang89@gmail.com on 2019-01-05
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class InnerEx1 {
    class InstanceInner{
        int iv = 100;
//        static int cv = 100;              //error. cannot be declare static variable
        final static int CONST =100;        //final static is constant, so can be declare

    }
    static class StaticInner {
        int iv = 200;
        static int cv = 200;                //static variable can be declared in static class
    }

    void myMethod(){
        class LocalInner {
            int iv = 300;
//            static int cv = 300;          //error. cannot be declare static variable
            final static int CONST = 300;   //final static is constant, so can be declare
        }
    }

    public static void main(String[] args) {
        System.out.println(InstanceInner.CONST);
        System.out.println(StaticInner.cv);
    }
}
