package Thread;

/**
 * Created by bobsang89@gmail.com on 2019-03-01
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class ThreadEx4 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        for(int i = 0; i < 300; i++)
            System.out.printf("%s", new String("-"));
        System.out.print("Total required time1 : " + (System.currentTimeMillis() - startTime));
        for(int i = 0; i < 300; i ++)
            System.out.printf("%s", new String("|"));
        System.out.print("Total required time2 : " + (System.currentTimeMillis() - startTime));
    }
}
