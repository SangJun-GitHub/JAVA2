package Thread;

/**
 * Created by bobsang89@gmail.com on 2019-03-05
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
class RunImplEx15 implements Runnable{
    public void run(){
        while(true){
            System.out.println(Thread.currentThread().getName());
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){}
        }
    }
}
public class ThreadEx15 {
    public static void main(String[] args) {
        RunImplEx15 r = new RunImplEx15();
        Thread th1 = new Thread(r, "*");
        Thread th2 = new Thread(r, "**");
        Thread th3 = new Thread(r, "***");
        th1.start();
        th2.start();
        th3.start();

        try{
            Thread.sleep(2000);
            th1.suspend();                          //th1 stop few moment
            Thread.sleep(2000);
            th2.suspend();
            th1.resume();                           //th1 re-run
            Thread.sleep(3000);
            th1.stop();                             //th1 stop
            th2.stop();
            Thread.sleep(2000);
            th3.stop();
        }catch(InterruptedException e){}
    }
}
