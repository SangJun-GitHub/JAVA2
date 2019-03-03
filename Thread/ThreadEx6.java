package Thread;

import javax.swing.*;

/**
 * Created by bobsang89@gmail.com on 2019-03-02
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class ThreadEx6 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter text");
        System.out.println("Input is " + input);

        for(int i = 10; i > 0; i--){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }catch(Exception e){}
        }
    }
}
