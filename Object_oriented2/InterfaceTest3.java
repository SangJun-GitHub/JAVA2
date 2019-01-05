package Object_oriented2;

/**
 * Created by bobsang89@gmail.com on 2019-01-04
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
interface I3 {
    public abstract void methodB();
}
class A3 {
    void methodA(){
        I3 i = InstanceManager.getInstance();
        i.methodB();
        System.out.println(i.toString());
    }
}
class B3 implements I3 {
    public void methodB(){
        System.out.println("methodB in B class");
    }
    public String toString(){
        return "Class B";
    }
}
class InstanceManager {
    public static I3 getInstance(){
        return new B3();
    }
}
public class InterfaceTest3 {
    public static void main(String[] args) {
        A3 a = new A3();
        a.methodA();
    }
}
