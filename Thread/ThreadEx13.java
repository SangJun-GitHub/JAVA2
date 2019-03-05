package Thread;

import javax.swing.*;

/**
 * Created by bobsang89@gmail.com on 2019-03-04
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
class ThreadEx13_1 extends Thread{
    public void run(){
        int i = 10;
        while(i !=0 && !isInterrupted()){
            System.out.println(i--);
            for(long x = 0; x < 2500000000L; x++);
        }
        System.out.println("Done countdown");
    }
}
public class ThreadEx13 {
    public static void main(String[] args) throws Exception {
        ThreadEx13_1 th1 = new ThreadEx13_1();
        th1.start();
        String input = JOptionPane.showInputDialog("Enter something");
        System.out.println("Your input : " + input);
        th1.interrupt();
        System.out.println("isInterrupted():" + th1.isInterrupted());
    }
}
