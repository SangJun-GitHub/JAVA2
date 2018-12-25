package Object_oriented1;

/**
 * Created by bobsang89@gmail.com on 2018-12-24
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class CarTest3 {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car(c1);
        System.out.println(c1);
        System.out.println(c2);
        c1.door = 2;
        System.out.println(c1);
        System.out.println(c2);
    }
}
