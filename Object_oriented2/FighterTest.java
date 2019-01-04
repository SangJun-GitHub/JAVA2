package Object_oriented2;

/**
 * Created by bobsang89@gmail.com on 2019-01-03
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
class Unit {
    int currentHP;
    int x;
    int y;
}

interface Movable{}
interface Attackable{}
interface Fightable extends Movable, Attackable{}

class Fighter extends Unit implements Fightable {
    public void move(int x, int y){}
    public void attak(Unit u){}
}

public class FighterTest {
    public static void main(String[] args) {
        Fighter f = new Fighter();

        if(f instanceof Unit)
            System.out.println("f is child of Unit class");
        if(f instanceof Fightable)
            System.out.println("f is implements of Fihable interface");
        if(f instanceof Movable)
            System.out.println("f is implements of Movable interface");
        if(f instanceof Attackable)
            System.out.println("f is implements of Attackable interface");
        if(f instanceof Object)
            System.out.println("f is child of Object class");
    }
}
