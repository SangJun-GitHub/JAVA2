package Thread;

import java.util.ArrayList;

/**
 * Created by bobsang89@gmail.com on 2019-03-07
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
class Table{
    String[] dishName = {"donut", "donut", "donut"};
    final int MAX_FOOD = 6;

    private ArrayList<String> dishes = new ArrayList<>();

    public void add(String dish){
        if(dishes.size() >= MAX_FOOD)
            return;
        dishes.add(dish);
        System.out.println("Dishes : " + dishes.toString());
    }

    public boolean remove(String dishName){
        for(int i = 0; i < dishes.size(); i++){
            if(dishName.equals(dishes.get(i))){
                dishes.remove(i);
                return true;
            }
        }
        return false;
    }

    public int dishNum(){
        return dishName.length;
    }
}
class Customer implements Runnable{
    private Table table;
    private String food;

    Customer(Table table, String food){
        this.table = table;
        this.food = food;
    }

    public void run(){
        while(true){
            try{
                Thread.sleep(10);
            }catch(InterruptedException e){}
            String name = Thread.currentThread().getName();

            if(eatFood())
                System.out.println(name + " ate a " + food + ". :)");
            else
                System.out.println(name + " failed to eat. :(");
        }
    }
    boolean eatFood(){
        return table.remove(food);
    }
}

class Cook implements Runnable{
    private Table table;

    Cook(Table table){
        this.table = table;
    }

    public void run(){
        while(true){
            int idx = (int)(Math.random() * table.dishNum());
            table.add(table.dishName[idx]);
            try{
                Thread.sleep(1);
            }catch (InterruptedException e){}
        }
    }
}
public class ThreadWaitEx1 {
    public static void main(String[] args) throws Exception{
        Table table = new Table();

        new Thread(new Cook(table), "COOK1").start();
        new Thread(new Customer(table, "donut"), "CUST1").start();
        new Thread(new Customer(table, "burger"), "CUST2").start();

        Thread.sleep(100);
        System.exit(0);
    }
}
