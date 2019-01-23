package Package_Utill;

import java.util.Random;

/**
 * Created by bobsang89@gmail.com on 2019-01-22
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class RandomEx1 {
    public static void main(String[] args) {
        Random rand = new Random(1);
        Random rand2 = new Random(1);

        System.out.println("= rand =");
        for(int i = 0; i < 8; i++)
            System.out.println(i + " : " + rand.nextInt());

        System.out.println();
        System.out.println("= rand2 =");
        for(int i = 0; i < 8; i++)
            System.out.println(i + " : " + rand2.nextInt());

    }
}
