package Object_oriented1;

/**
 * Created by bobsang89@gmail.com on 2018-12-20
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class FactorialTest {
    public static void main(String[] args) {
        System.out.println("factorial(0) = " + factorial(0));
        System.out.println("factorial(1) = " + factorial(1));
        System.out.println("factorial(5) = " + factorial(5));
        System.out.println("factorial(13) = " + factorial(13));
        System.out.println("factorial(-10) = " + factorial(-10));
    }

    static int factorial(int n){
        int result;
        if(n <= 0 || n > 12) //validity check
            return -1;

        if(n == 1)
            return 1;
        else
            result = n * factorial(n-1);
        return  result;
    }
}
