package Object_oriented2;

/**
 * Created by bobsang89@gmail.com on 2018-12-28
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
class Car {
    String color;
    int door;

    void drive(){
        System.out.println("dive, brrrr~");
    }
    void stop(){
        System.out.println("stop!!!");
    }
}
class FireEngine extends Car{
    void water(){
        System.out.println("water!!!");
    }
}
public class CastingTest1 {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe;       // car = (Car)fe;
        //car.water     // error. Car type cannot call water()
        fe2 = (FireEngine)car;
        fe2.water();
    }
}
