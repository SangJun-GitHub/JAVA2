package Thread;

/**
 * Created by bobsang89@gmail.com on 2019-03-01
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
class ThreadEx5_1 extends Thread{
    public void run(){
        for(int i = 0; i < 300; i++)
            System.out.printf("%s", new String("|"));
        System.out.print("Total required time2 : " + (System.currentTimeMillis() - ThreadEx5.startTime));
    }
}
public class ThreadEx5 {
    static long startTime = 0;
    public static void main(String[] args) {
        ThreadEx5_1 th1 = new ThreadEx5_1();
        th1.start();
        startTime = System.currentTimeMillis();

        for(int i = 0; i < 300; i++)
            System.out.printf("%s", new String("-"));
        System.out.print("Total required time1 : " + (System.currentTimeMillis() - ThreadEx5.startTime));
    }
}
