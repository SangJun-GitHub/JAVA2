package Object_oriented1;

/**
 * Created by bobsang89@gmail.com on 2018-12-20
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class ReferenceParamEx2 {
    public static void main(String[] args) {
        int[] x = {10}; // x[0] = 10
        System.out.println("main() : x = " + x[0]);

        //Array also approach through reference variable
        change(x);
        System.out.println("After change(int[] x)");
        System.out.println("main() : x = " + x[0]);
    }
    static void change(int[] x){
        x[0] = 1000;
        System.out.println("change(int[] x) : x = " + x[0]);
    }
}
