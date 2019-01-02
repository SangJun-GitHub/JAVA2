package Object_oriented2;

/**
 * Created by bobsang89@gmail.com on 2019-01-01
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
class Product3 {
    int price;
    int bonusPoint;

    Product3(){}
    Product3(int price){
        this.price = price;
        this.bonusPoint = (int)(price/10.0);
    }
}
class Tv3 extends Product3{
    Tv3(){
        super(400);
    }
    public String toString(){
        return "Tv";
    }
}
class Computer3 extends Product3{
    Computer3(){
        super(500);
    }
    public String toString(){
        return "Computer";
    }
}
class Audio3 extends Product3{
    Audio3(){
        super(100);
    }
    public String toString(){
        return "Audio";
    }
}
class Buyer3{
    int money = 1000;
    int bonusPoint = 0;
    Product3[] item = new Product3[10];
    int i = 0;

    void buy(Product3 p){
        if(money < p.price){
            System.out.println("Not enough money to buy " + p);
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        item[i++] = p;
        System.out.println("Success to buy " + p);
    }
    void summary(){
        int sum = 0;
        String itemList = "";

        for(int i = 0; i < item.length; i++){
            if(item[i] == null)
                break;
            sum += item[i].price;
            itemList += item[i] + ", ";
        }
        System.out.println("Total price of products is " + sum);
        System.out.println("Item list of products is " + itemList);
    }
}
public class PolyArgumentTest2 {
    public static void main(String[] args) {
        Buyer3 b = new Buyer3();

        b.buy(new Tv3());
        b.summary();
        b.buy(new Computer3());
        b.summary();
        b.buy(new Audio3());
        b.summary();
        b.buy(new Tv3());
        b.summary();
        
    }
}
