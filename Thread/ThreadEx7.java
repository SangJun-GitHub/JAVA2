package Thread;

import javax.swing.*;

/**
 * Created by bobsang89@gmail.com on 2019-03-02
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
class ThreadEx7_1 extends Thread{
    public void run(){
        for(int i =10; i >0; i--){
            System.out.println(i);
            try{
                sleep(1000);
            }catch (Exception e){}
        }
    }
}
public class ThreadEx7 {
    public static void main(String[] args) {
        ThreadEx7_1 th1 = new ThreadEx7_1();
        th1.start();

        String input = JOptionPane.showInputDialog("Enter text");
        System.out.println("Input is " + input);
    }
}
