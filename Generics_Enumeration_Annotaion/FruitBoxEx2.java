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
class FruitBox2<T extends Fruit2 & Eatable> extends Box2<T>{}

public class FruitBoxEx2 {
    public static void main(String[] args) {
        FruitBox2<Fruit2> fruitBox = new FruitBox2<Fruit2>();
        FruitBox2<Apple2> appleBox = new FruitBox2<Apple2>();
        FruitBox2<Grape2> grapeBox = new FruitBox2<Grape2>();
        //FruitBox2<Grape2> grapeBox = new FruitBox2<Apple2>();       Error. unmatched type.
        //FruitBox2<Toy2> toyBox = new FruitBox2<Toy2>();             Error. because of Eatable interface.

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
