package Object_oriented1;

/**
 * Created by bobsang89@gmail.com on 2018-12-22
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class MemberCall {
    int iv = 10;
    static int cv = 20;

    int iv2 = cv;
    //static int cv2 = iv;      //error. class variable cannot use instance variable
    static int cv2 = new MemberCall().iv;

    static void staticMethod1(){
        System.out.println(cv);
     //   System.out.println(iv);       //error. cannot use instance variable in class method
        MemberCall c = new MemberCall();
        System.out.println(c.iv);       //can use instance variable after creating object
    }

    void instanceMethod1(){
        System.out.println(cv);
        System.out.println(iv);     //can ues instance variable in instance method
    }

    static void staticMethod2(){
        staticMethod1();
     //   instanceMethod1();        //error. cannot call instance method in class method
        MemberCall c = new MemberCall();
        c.instanceMethod1();        //can call instance method after creating object
    }

    void instanceMethod2(){         //can call instance method and class method in instance method
        staticMethod1();
        instanceMethod1();
    }
}
