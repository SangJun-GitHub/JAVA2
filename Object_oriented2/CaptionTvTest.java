package Object_oriented2;

/**
 * Created by bobsang89@gmail.com on 2018-12-25
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
class Tv {
    boolean power;
    int channel = 1;

    void power(){ power = !power; }
    void channelUp() { ++channel; }
    void channelDown() { --channel; }
}
class CaptionTv extends Tv{
    boolean caption;
    void displayCaption(String text){
        if(caption)
            System.out.println(text);
    }
}
public class CaptionTvTest {
    public static void main(String[] args) {
        CaptionTv ctv = new CaptionTv();
        System.out.println(ctv.channel);
        ctv.channel = 10;
        ctv.channelUp();
        System.out.println(ctv.channel);
        ctv.displayCaption("Hello, world");
        ctv.caption = true;
        ctv.displayCaption("Hello, world");
    }
}
