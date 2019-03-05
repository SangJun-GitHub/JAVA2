package Thread;

/**
 * Created by bobsang89@gmail.com on 2019-03-04
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
class ThreadEx12_1 extends Thread{
    public void run(){
        for(int i = 0; i < 300; i++ )
            System.out.print("-");
        System.out.println("<< Exit Th1 >>");
    }
}
class ThreadEx12_2 extends Thread{
    public void run(){
        for(int i = 0; i < 300; i++)
            System.out.print("|");
        System.out.println("<< Exit Th2 >>");
    }
}
public class ThreadEx12 {
    public static void main(String[] args) {
        ThreadEx12_1 th1 = new ThreadEx12_1();
        ThreadEx12_2 th2 = new ThreadEx12_2();
        th1.start();
        th2.start();

        try{
            th1.sleep(1000);
        }catch(InterruptedException e){}
        System.out.println("<< Exit main >>");
    }
}
