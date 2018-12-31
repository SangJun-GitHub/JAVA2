package Object_oriented2;

/**
 * Created by bobsang89@gmail.com on 2018-12-30
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
class Parent3 {
    int x = 100;

    void method(){
        System.out.println("Parent Method");
    }
}

class Child3 extends Parent3{

}
public class BindingTest2 {
    public static void main(String[] args) {
        Parent3 p = new Child3();
        Child3 c = new Child3();

        System.out.println("p.x = " + p.x);
        p.method();

        System.out.println("c.x = " + c.x);
        c.method();
    }
}
