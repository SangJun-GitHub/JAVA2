package Object_oriented1;

/**
 * Created by bobsang89@gmail.com on 2018-12-19
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class TvTest4 {
    public static void main(String[] args) {
        Tv[] tvArr = new Tv[3];
        for (int i = 0; i < tvArr.length; i++){
            tvArr[i] = new Tv();
            tvArr[i].channel = i+10;
        }
        for(int i = 0; i < tvArr.length; i++ ){
            tvArr[i].channelUp();
            System.out.println("tv" + i +" channel is "+tvArr[i].channel);
        }
    }
}
