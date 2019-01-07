package Object_oriented2;

/**
 * Created by bobsang89@gmail.com on 2019-01-06
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class InnerEx6 {
    Object iv = new Object() {void method(){}};             //anonymous class
    static Object cv = new Object(){void mehtod(){}};       //anonymous class

    void myMethod(){
        Object lv = new Object(){void method(){}};          //anonymous class
    }
}
