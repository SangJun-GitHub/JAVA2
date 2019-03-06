package Thread;

/**
 * Created by bobsang89@gmail.com on 2019-03-06
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
class ThreadEx19_1 extends Thread{
    public void run(){
        for(int i =0; i < 300; i++)
            System.out.print(new String("-"));
    }
}
class ThreadEx19_2 extends Thread{
    public void run(){
        for(int i = 0; i < 300; i++)
            System.out.print(new String("|"));
    }
}
public class ThreadEx19 {
    static long startTime = 0;

    public static void main(String[] args) {
        ThreadEx19_1 th1 = new ThreadEx19_1();
        ThreadEx19_2 th2 = new ThreadEx19_2();
        th1.start();
        th2.start();
        startTime = System.currentTimeMillis();

        try{
            th1.join();
            th2.join();
        }catch (InterruptedException e){}

        System.out.println("Usage time : " + (System.currentTimeMillis() - ThreadEx19.startTime));
    }
}
