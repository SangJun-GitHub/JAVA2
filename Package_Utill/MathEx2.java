package Package_Utill;
import static java.lang.Math.*;
import static java.lang.System.*;

/**
 * Created by bobsang89@gmail.com on 2019-01-21
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class MathEx2 {
    public static void main(String[] args) {
        int i = Integer.MIN_VALUE;

        out.println("i =" +i);
        out.println("-i=" +(-i));

        try{
            out.printf("negateExact(%d)= %d\n", 10, negateExact(10));
            out.printf("negateExact(%d)= %d\n", -10, negateExact(-10));
            out.printf("negateExact(%d)= %d\n", i, negateExact(i));
        }catch(ArithmeticException e){
            //convert long type to i, then call negateExact(long a)
            out.printf("negateExact(%d)= %d\n", (long)i, negateExact((long)i));
        }
    }
}
