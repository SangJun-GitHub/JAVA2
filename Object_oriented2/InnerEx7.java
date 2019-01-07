package Object_oriented2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by bobsang89@gmail.com on 2019-01-06
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
class EventHandler implements ActionListener{
    public void actionPerformed(ActionEvent e){
        System.out.println("ActionEvent occurred!!!");
    }
}
public class InnerEx7 {
    public static void main(String[] args) {
        Button b = new Button("Start");
        b.addActionListener(new EventHandler());
    }
}

//public class InnerEx8 {
//    public static void main(String[] args) {
//        Button b = new Button("Start");
//        b.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e){
//                System.out.println("ActionEvent occurred!!");
//            }
//        });       //anonymous class
//    }
//}
