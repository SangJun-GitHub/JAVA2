package Object_oriented1;

/**
 * Created by bobsang89@gmail.com on 2018-12-25
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class StaticBlockTest {
    static int[] arr = new int[10];

    static {
        for(int i = 0; i < arr.length; i++)
            arr[i] = (int)(Math.random() * 10) + 1;
    }

    public static void main(String[] args) {
        for(int i = 0; i < arr.length; i++)
            System.out.println("arr[" + i + "] : " + arr[i]);
    }
}
