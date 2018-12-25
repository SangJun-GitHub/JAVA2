package Object_oriented1;

/**
 * Created by bobsang89@gmail.com on 2018-12-24
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
class Car{
    String color;
    String gearType;
    int door;

    Car(){}

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", gearType='" + gearType + '\'' +
                ", door=" + door +
                '}';
    }

    Car(String c, String g, int d){
        color = c;
        gearType = g;
        door = d;
    }
}
public class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.color = "white";
        c1.gearType = "auto";
        c1.door = 4;

        System.out.println(c1);

        Car c2 = new Car("black", "manual", 2);

        System.out.println(c2);
    }
}
