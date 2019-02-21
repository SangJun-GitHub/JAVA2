package Collection_framework;


import java.util.*;

/**
 * Created by bobsang89@gmail.com on 2019-02-20
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class HashSetEx3 {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add("abc");
        set.add("abc");
        set.add(new Person("David",10));
        set.add(new Person("David",10));

        System.out.println(set);
    }
}
class Person{
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return name + ":" + age;
    }
}
