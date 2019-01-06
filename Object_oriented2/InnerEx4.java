package Object_oriented2;

/**
 * Created by bobsang89@gmail.com on 2019-01-05
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
class Outer4{
    class InstanceInner4 {
        int iv = 100;
    }

    static class StaticInner4{
        int iv = 200;
        static int cv = 300;
    }

    void myMethod(){
        class LocalInner4{
            int iv = 400;
        }
    }
}
public class InnerEx4 {
    public static void main(String[] args) {
        //To create an instance of an instance class,
        //you must first create an instance of the outer class.
        Outer4 oc = new Outer4();
        Outer4.InstanceInner4 ii = oc.new InstanceInner4();

        System.out.println("ii.iv : " + ii.iv);
        System.out.println("Outer4.StaticInner.cv : " + Outer4.StaticInner4.cv);

        //An instance of the static inner class does not need to create an outer class first.
        Outer4.StaticInner4 si = new Outer4.StaticInner4();
        System.out.println("si.iv : " + si.iv);
    }
}
