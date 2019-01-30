package Package_Utill;

import java.math.BigInteger;

/**
 * Created by bobsang89@gmail.com on 2019-01-29
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class BigIntegerEx {
    public static void main(String[] args) throws Exception{
        for(int i = 1; i < 100; i++) {      // from 1! to 99!
            System.out.printf("%d!=%s\n", i, calcFactorial(i));
            Thread.sleep(300);         //delay 0.3 seconds
        }
    }
    static String calcFactorial(int n){
        return factorial(BigInteger.valueOf(n)).toString();
    }
    static BigInteger factorial(BigInteger n){
        if(n.equals(BigInteger.ZERO))
            return BigInteger.ONE;
        else            //return n * factorial(n-1);
            return n.multiply(factorial(n.subtract(BigInteger.ONE)));
    }
}
