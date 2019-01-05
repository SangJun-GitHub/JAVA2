package Object_oriented2;

/**
 * Created by bobsang89@gmail.com on 2019-01-04
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
class A {
    public void methodA(B b){
        b.methodB();
    }
}
class B {
    public void methodB(){
        System.out.println("methodB()");
    }
}
public class InterfaceTest {
    public static void main(String[] args) {
        A a = new A();
        a.methodA(new B());
    }
}
