package Object_oriented2;

/**
 * Created by bobsang89@gmail.com on 2018-12-30
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class CastingTest2 {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = null;
        FireEngine fe = null;

        car.drive();
        fe = (FireEngine)car;   //can compile, but runtime error
        fe.drive();
        car2 = fe;
        car2.drive();
    }
}
