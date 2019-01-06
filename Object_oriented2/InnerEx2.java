package Object_oriented2;

/**
 * Created by bobsang89@gmail.com on 2019-01-05
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class InnerEx2 {
    class InstanceInner2{}
    static class StaticInner2{}

    //Instance members have access to each other.
    InstanceInner2 iv = new InstanceInner2();
    //Static members have access to each other.
    static StaticInner2 cv = new StaticInner2();

    static void staticMethod() {
        //A static member can not directly access an instance member
//        InstanceInner2 obj1 = new InstanceInner2();
        StaticInner2 obj2 = new StaticInner2();
        //An instance class can only be created by first creating an external class.
        InnerEx2 outer = new InnerEx2();
        InstanceInner2 obj1 = outer.new InstanceInner2();
    }

    void instanceMethod(){
        //Instance methods have access to both instance members and static members.
        InstanceInner2 obj1 = new InstanceInner2();
        StaticInner2 obj2 = new StaticInner2();
        //Inner classes declared locally in a method are not accessible from outside.
//        LocalInner2 lv = new LocalInner2();
    }

    void myMethod(){
        class LocalInner2{}
        LocalInner2 lv = new LocalInner2();
    }
}
