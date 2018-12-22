package Object_oriented1;

/**
 * Created by bobsang89@gmail.com on 2018-12-20
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class FactorialTest2 {
    public static void main(String[] args) {
        int n = 21;
        long result;

        for (int i = 1; i <= n; i++){
            result = factorial(i);

            if(result == -1){
                System.out.printf("Invalid value. (0 < n <= 20) : %d\n", n);
                break;
            }
            System.out.printf("%2d!= %20d\n",i,result);
        }
    }

    static long factorial(int n){
        if(n <= 0 || n > 20) return -1;
        if(n == 1 )
            return 1;
        else
            return n * factorial(n-1);
    }
}
