package Generics_Enumeration_Annotaion;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by bobsang89@gmail.com on 2019-02-25
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
interface  Eatable {}

class Fruit2 implements Eatable{
    public String toString(){
        return "Fruit2";
    }
}
class Apple2 extends Fruit2{
    public String toString(){
        return "Apple2";
    }
}
class Grape2 extends Fruit2{
    public String toString(){
        return "Grape2";
    }
}
class Toy2{
    public String toString(){
        return "Toy2";
    }
}
class Box2<T>{
    ArrayList<T> list = new ArrayList<T>();

    void add(T item){
        list.add(item);
    }

    T get(int i){
        return list.get(i);
    }

    int size(){
        return list.size();
    }
    public String toString(){
        return list.toString();
    }
}
class FruitBox<T extends Fruit2 & Eatable> extends Box<T>{}

public class FruitBoxEx2 {
    public static void main(String[] args) {
        FruitBox<Fruit2> fruitBox = new FruitBox<Fruit2>();
        FruitBox<Apple2> appleBox = new FruitBox<Apple2>();
        FruitBox<Grape2> grapeBox = new FruitBox<Grape2>();
        //FruitBox<Grape2> grapeBox = new FruitBox<Apple2>();       Error. unmatched type.
        //FruitBox<Toy2> toyBox = new FruitBox<Toy2>();             Error. because of Eatable interface.

        fruitBox.add(new Fruit2());
        fruitBox.add(new Apple2());
        fruitBox.add(new Grape2());
        appleBox.add(new Apple2());
        //appleBox.add(new Grape2());                               Error. Grape class is not child of Apple class.
        grapeBox.add(new Grape2());

        System.out.println("fruitBox = " + fruitBox);
        System.out.println("appleBox = " + appleBox);
        System.out.println("grapeBox = " + grapeBox);
    }
}
