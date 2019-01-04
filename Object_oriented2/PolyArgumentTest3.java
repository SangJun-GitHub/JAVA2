package Object_oriented2;

import java.util.Vector;

/**
 * Created by bobsang89@gmail.com on 2019-01-03
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
class Product4 {
    int price;
    int bonusPoint;

    Product4(){
        price = 0;
        bonusPoint = 0;
    }
    Product4(int price){
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }
}
class Tv4 extends Product4 {
    Tv4() {
        super(100);
    }
    public String toString(){
        return "Tv";
    }
}
class Computer4 extends Product4 {
    Computer4(){
        super(200);
    }
    public String toString(){
        return "Computer";
    }
}
class Audio4 extends Product4 {
    Audio4(){
        super(50);
    }
    public String toString(){
        return "Audio";
    }
}
class Buyer4 {
    int money = 1000;
    int bonusPoint = 0;
    Vector item = new Vector();

    void buy(Product4 p){
        if(money < p.price){
            System.out.println("Not enough money to buy " + p);
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        item.add(p);
        System.out.println("Success to buy " + p);
    }

    void refund(Product4 p){
        if(item.remove(p)){
            money += p.price;
            bonusPoint -= p.bonusPoint;
            System.out.println("Success to refund " + p);
        }else{
            System.out.println("Cannot find " + p + " int your list");
        }
    }

    void summary(){
        int sum = 0;
        String itemList = "";

        if(item.isEmpty()){
            System.out.println("Empty your list");
            return;
        }

        for(int i =0; i< item.size(); i++){
            Product4 p = (Product4)item.get(i);
            sum += p.price;
            itemList += (i==0)? "" + p : ", " + p;
        }
        System.out.println("Total price is " + sum);
        System.out.println("your list is " + itemList);
    }
}
public class PolyArgumentTest3 {
    public static void main(String[] args) {
        Buyer4 b = new Buyer4();
        Tv4 tv = new Tv4();
        Computer4 com = new Computer4();
        Audio4 audio = new Audio4();

        b.buy(tv);
        b.buy(com);
        b.buy(audio);
        b.summary();
        System.out.println();

        b.refund(com);
        b.summary();
    }
}
