package Object_oriented2;

/**
 * Created by bobsang89@gmail.com on 2019-01-03
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
interface Repairable{}
class Unit2{
    int hitPoint;
    final int MAX_HP;

    Unit2(int hp){
        MAX_HP = hp;
    }
}
class GroundUnit2 extends Unit2{
    GroundUnit2(int hp){
        super(hp);
    }
}
class AirUnit2 extends Unit2{
    AirUnit2(int hp){
        super(hp);
    }
}
class Tank2 extends GroundUnit2 implements Repairable{
    Tank2(){
        super(100);
        hitPoint = MAX_HP;
    }
    public String toString(){
        return "Tank";
    }
}
class Dropship2 extends AirUnit2 implements Repairable{
    Dropship2(){
        super(125);
        hitPoint = MAX_HP;
    }
    public String toString(){
        return "Drop ship";
    }
}
class Marine2 extends GroundUnit2 {
    Marine2(){
        super(40);
        hitPoint = MAX_HP;
    }
    public String toString(){
        return "Marine";
    }
}
class SCV2 extends GroundUnit2 implements Repairable{
    SCV2(){
        super(60);
        hitPoint = MAX_HP;
    }
    void repair(Repairable r){
        if(r instanceof Unit2){
            Unit2 u = (Unit2)r;
            while(u.hitPoint!=u.MAX_HP)
                u.hitPoint++;
            System.out.println(u.toString() + "is repaired");
        }

    }
    public String toString(){
        return "SCV";
    }
}
public class RepairableTest {
    public static void main(String[] args) {
        Tank2 tank = new Tank2();
        Dropship2 doropship = new Dropship2();
        Marine2 marine = new Marine2();
        SCV2 scv = new SCV2();

        scv.repair(tank);
        scv.repair(doropship);
        //scv.repair(marine);       error. because marine is not repairable
    }
}
