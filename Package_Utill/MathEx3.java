package Package_Utill;
import static java.lang.Math.*;
import static java.lang.System.*;

/**
 * Created by bobsang89@gmail.com on 2019-01-21
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class MathEx3 {
    public static void main(String[] args) {
        int x1 = 1, y1 = 1;
        int x2 = 2, y2 = 2;

        double c = sqrt(pow(x2-x1, 2) + pow(y2-y1, 2));
        double a = c * sin(PI/4);
        double b = c * cos(PI/4);
        //double b = c * cos(toRadians(45));

        out.printf("a = %f\n", a);
        out.printf("b = %f\n", b);
        out.printf("c = %f\n", c);

        out.printf("angle = %f rad\n", atan2(a,b));
        out.printf("angle = %f degree\n\n", atan2(a,b) * 180 /PI);
        //out.printf("angle=%f degree\n\n", toDegrees(atan2(a,b)));

        out.printf("24 * log10(2) = %f\n", 24 * log10(2));        //7.224720
        out.printf("53 * log10(2) = %f\n", 53 * log10(2));        //15.954590
    }
}