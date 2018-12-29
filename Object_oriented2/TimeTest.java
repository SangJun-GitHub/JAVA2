package Object_oriented2;

/**
 * Created by bobsang89@gmail.com on 2018-12-28
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
class Time{
    private int hour, minute, second;

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    @Override
    public String toString() {
        return "Time{" +
                "hour=" + hour +
                ", minute=" + minute +
                ", second=" + second +
                '}';
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    Time(int h, int m, int s){
        setHour(h);
        setMinute(m);
        setSecond(s);
    }

}
public class TimeTest {
    public static void main(String[] args) {
        Time t = new Time(12,35,30);
        System.out.println(t);
//        t.hour = 13       //error. cannot access hour because of private
        t.setHour(t.getHour()+1);
        System.out.println(t);
    }
}
