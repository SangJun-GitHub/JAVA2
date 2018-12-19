package Object_oriented1;

/**
 * Created by bobsang89@gmail.com on 2018-12-19
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class TvTest2 {
    public static void main(String[] args) {
        Tv t2 = new Tv();
        Tv t3 = new Tv();
        System.out.println("t2 channel is " + t2.channel);
        System.out.println("t3 channel is " + t3.channel);

        t2.channel = 77; //Can change the value through the member variable
        System.out.println("t2 channel was changed to 77");

        System.out.println("t2 channel is " + t2.channel);
        System.out.println("t3 channel is " + t3.channel);
    }
}
