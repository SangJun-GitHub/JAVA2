package Object_oriented2;

/**
 * Created by bobsang89@gmail.com on 2019-01-04
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
class Child5 extends Parent5 implements MyInterface, MyInterface2 {
    public void method1(){
        System.out.println("method1() in Child");
    }
}
class Parent5 {
    public void method2(){
        System.out.println("method2() in Parent");
    }
}
interface MyInterface {
    default void method1(){
        System.out.println("method1() in MyInterface");
    }
    default void method2(){
        System.out.println("method2() in MyInterface");
    }
    static void staticMethod() {
        System.out.println("staticMethod() in MyInterface");
    }
}
interface MyInterface2{
    default void method1(){
        System.out.println("method1() in MyInterface2");
    }
    static void staticMethod() {
        System.out.println("staticMethod() in MyInterface2");
    }
}
public class DefaultMethodTest {
    public static void main(String[] args) {
        Child5 c = new Child5();
        c.method1();
        c.method2();
        MyInterface.staticMethod();
        MyInterface2.staticMethod();
    }
}
