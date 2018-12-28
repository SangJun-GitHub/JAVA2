package Object_oriented2;

/**
 * Created by bobsang89@gmail.com on 2018-12-27
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
class Child extends Parent{
    int x = 20;
    void method() {
        System.out.println("x = " + x);
        System.out.println("this.x = " + this.x);
        System.out.println("super.x = " + super.x);
    }
}
class Parent {
    int x = 10;
}
public class SuperTest {
    public static void main(String[] args) {
        Child c = new Child();
        c.method();
    }
}
