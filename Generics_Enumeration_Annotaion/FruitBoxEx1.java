package Generics_Enumeration_Annotaion;

import java.util.ArrayList;

/**
 * Created by bobsang89@gmail.com on 2019-02-25
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
class Fruit{
    public String toString(){
        return "Fruit";
    }
}
class Apple extends Fruit{
    public String toString(){
        return "Apple";
    }
}
class Grape extends Fruit{
    public String toString(){
        return "Grape";
    }
}
class Toy{
    public String toString(){
        return "Toy";
    }
}
class Box<T>{
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

public class FruitBoxEx1 {
    public static void main(String[] args) {
        Box<Fruit> fruitBox = new Box<Fruit>();
        Box<Apple> appleBox = new Box<Apple>();
        Box<Toy> toyBox = new Box<Toy>();

        //Box<Grape> grapeBox = new Box<Apple>();       Error. unmatched type.
        //Box<Toy> toyBox = new Box<Apple>();           Error. unmatched type.

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());                      //void add(Fruit item)

        appleBox.add(new Apple());
        appleBox.add(new Apple());
        //appleBox.add(new Toy());                      Error. could not add Toy type in appleBox.

        toyBox.add(new Toy());
        //toyBox.add(new Apple());                      Error. could not add Apple type in toyBox.

        System.out.println(fruitBox);
        System.out.println(appleBox);
        System.out.println(toyBox);
    }
}
