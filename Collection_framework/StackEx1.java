package Collection_framework;

import java.util.Stack;

/**
 * Created by bobsang89@gmail.com on 2019-02-12
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class StackEx1 {
    public static Stack back = new Stack();
    public static Stack forward = new Stack();

    public static void main(String[] args) {
        goURL("1.google");
        goURL("2.facebook");
        goURL("3.twitter");
        goURL("4.instagram");

        printStatus();

        goBack();
        System.out.println("=== After click goBack button ===");
        printStatus();

        goBack();
        System.out.println("=== After click goBack button ===");;
        printStatus();

        goForward();
        System.out.println("=== After click goForward button ===");;
        printStatus();

        goURL("seneca");
        System.out.println("=== After move to new address ===");
        printStatus();

    }

    public static void printStatus(){
        System.out.println("back: "+back);
        System.out.println("forward: "+forward);
        System.out.println("current: "+ back.peek());
        System.out.println();
    }
    public static void goURL(String url){
        back.push(url);
        if(!forward.empty())
            forward.clear();
    }
    public static void goForward(){
        if(!forward.empty())
            back.push(forward.pop());
    }
    public static void goBack(){
        if(!back.empty())
            forward.push(back.pop());
    }
}
