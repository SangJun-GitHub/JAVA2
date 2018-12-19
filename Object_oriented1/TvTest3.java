package Object_oriented1;

/**
 * Created by bobsang89@gmail.com on 2018-12-19
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class TvTest3 {
    public static void main(String[] args) {
        Tv t4 = new Tv();
        Tv t5 = new Tv();

        System.out.println("t4 channel is " + t4.channel);
        System.out.println("t5 channel is " + t5.channel);

        t5 = t4; // t5 point the same address of t4
        t5.channel = 77;
        System.out.println("t5 channel was changed to 77");

        System.out.println("t1 channel is " + t4.channel);
        System.out.println("t2 channel is " + t5.channel);

        t4.channel = 66;
        System.out.println("t4 channel was changed to 66");

        System.out.println("t4 channel is " + t4.channel);
        System.out.println("t5 channel is " + t5.channel);

    }
}
