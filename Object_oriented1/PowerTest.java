package Object_oriented1;

/**
 * Created by bobsang89@gmail.com on 2018-12-20
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class PowerTest {
    public static void main(String[] args) {

        System.out.println("2 power of 5 : " + cycle(2,5));
        System.out.println("3 power of 5 : " + cycle(3,5));
        System.out.println("0 power of 5 : " + cycle(0,5));
    }
    static long cycle(int x, int n){
        int result = 0;
        for(int i = 1; i <= n; i++)
            result += power(x, i);
        return result;
    }
    static long power(int x, int n){
        if(n == 1|| x == 0) return x;
        return x * power(x, n-1);
    }
}
