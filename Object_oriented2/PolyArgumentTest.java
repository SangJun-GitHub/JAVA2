package Object_oriented2;

/**
 * Created by bobsang89@gmail.com on 2019-01-01
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
class Product {
    int price;
    int bonusPoint;

    Product(int price){
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }
}

class Tv2 extends Product {
    Tv2(){
        super(400);
    }

    public String toString(){
        return "TV";
    }
}

class Computer extends Product{
    Computer(){
        super(500);
    }

    public String toString(){
        return "Computer";
    }
}

class Buyer {
    int money = 1000;
    int bonusPoint =0;

    void buy(Product p){
        if(money < p.price){
            System.out.println("Not enough money to buy product");
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
        Buyer b = new Buyer();

        b.buy(new Tv2());
        b.status();
        b.buy(new Computer());
        b.status();

        b.buy(new Computer());
        b.status();

    }
}
