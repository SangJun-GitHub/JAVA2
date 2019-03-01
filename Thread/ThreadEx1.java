package Thread;

/**
 * Created by bobsang89@gmail.com on 2019-02-28
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
class ThreadEx1_1 extends Thread{
    public void run(){
        for(int i = 0; i < 5; i++)
            System.out.println(getName());
    }
}
class ThreadEx1_2 implements Runnable{
    public void run(){
        for(int i = 0; i < 5; i++)
            System.out.println(Thread.currentThread().getName());
    }
}

public class ThreadEx1 {
    public static void main(String[] args) {
        ThreadEx1_1 t1 = new ThreadEx1_1();

        Runnable r = new ThreadEx1_2();
        Thread t2 = new Thread(r);      //constructor Thread(Runnable target)

        t1.start();
        t2.start();
    }
}
