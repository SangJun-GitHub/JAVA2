package Object_oriented2;

/**
 * Created by bobsang89@gmail.com on 2019-01-01
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
class Product2 {
    int price;
    int bonusPoint;

    Product2(int price){
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }
}

class Tv2 extends Product2 {
    Tv2(){
        super(400);
    }

    public String toString(){
        return "TV";
    }
}

class Computer2 extends Product2{
    Computer2(){
        super(500);
    }

    public String toString(){
        return "Computer";
    }
}

class Buyer2 {
    int money = 1000;
    int bonusPoint =0;

    void buy(Product2 p){
        if(money < p.price){
            System.out.println("Not enough money to buy " + p);
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        System.out.println("Success to buy " + p);
    }

    void status(){
        System.out.println("your current money is " + money);
        System.out.println("your current bonusPoint is " + bonusPoint);
    }
}

public class PolyArgumentTest {
    public static void main(String[] args) {
        Buyer2 b = new Buyer2();

        b.buy(new Tv2());
        b.status();
        b.buy(new Computer2());
        b.status();

        b.buy(new Computer2());
        b.status();

    }
}
