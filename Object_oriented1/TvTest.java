package Object_oriented1;

/**
 * Created by bobsang89@gmail.com on 2018-12-19
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
class Tv {
    String color = "black";
    boolean power = false;
    int channel =7;

    void power(){
        power = !power;
    }
    void channelUp(){
        if(power) {
            System.out.println("Channel up");
            ++channel;
            System.out.println("Current channel is " + this.channel);
        }else{
            System.out.println("Please turn on the Tv");
        }
    }
    void channelDown(){
        if(power) {
            System.out.println("Channel down");
            --channel;
            System.out.println("Current channel is " + this.channel);
        }else {
            System.out.println("Please turn on the Tv");
        }
    }
}
public class TvTest{
    public static void main(String[] args) {
        Tv t = new Tv();
        System.out.println("Tv on? " + t.power);
        System.out.println(t.channel);
        t.channelUp();
        t.channelDown();

        t.power();
        System.out.println("Tv on? " + t.power);
        System.out.println(t.channel);
        t.channelUp();
        t.channelDown();

    }
}
