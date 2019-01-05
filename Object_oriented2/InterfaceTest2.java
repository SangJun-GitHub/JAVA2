package Object_oriented2;

/**
 * Created by bobsang89@gmail.com on 2019-01-04
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
interface I2 {
    public abstract void play();
}
class A2 {
    void autoPlay(I2 i){
        i.play();
    }
}

class B2 implements I2 {
    public void play(){
        System.out.println("play in B class");
    }
}

class C2 implements I2 {
    public void play(){
        System.out.println("play in C class");
    }
}
public class InterfaceTest2 {
    public static void main(String[] args) {
        A2 a = new A2();
        a.autoPlay(new B2());
        a.autoPlay(new C2());
    }
}
