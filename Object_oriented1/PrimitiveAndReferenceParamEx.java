package Object_oriented1;

/**
 * Created by bobsang89@gmail.com on 2018-12-20
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
class Data{
    int x;
}
public class PrimitiveAndReferenceParamEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        //Primitive
        change(d.x);
        System.out.println("After change(int x) - Primitive Param");
        System.out.println("main() : x = " + d.x);

        //Reference
        change(d);
        System.out.println("After change(Data d) - Reference Param");
        System.out.println("main() : x = " + d.x);
    }

    static void change(int x){
        x = 1000;
        System.out.println("change(int x) : x = " + x);
    }

    static void change(Data d){
        d.x = 1000;
        System.out.println("change(Data d) : x = " + d.x);
    }
}
