package Thread;

import javax.swing.*;

/**
 * Created by bobsang89@gmail.com on 2019-03-05
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
class ThreadEx14_1 extends Thread{
    public void run(){
        int i = 10;

        while(i !=0 && !isInterrupted()){
            System.out.println(i--);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){}
        }
        System.out.println("Exit countdown");
    }
}
public class ThreadEx14 {
    public static void main(String[] args) throws Exception{
        ThreadEx14_1 th1 = new ThreadEx14_1();
        th1.start();

        String input = JOptionPane.showInputDialog("Enter something");
        System.out.println("Your input is :" + input);
        th1.interrupt();
        System.out.println("isInterrupted() :" + th1.isInterrupted());
    }
}
