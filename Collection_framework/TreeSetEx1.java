package Collection_framework;

import java.util.TreeSet;

/**
 * Created by bobsang89@gmail.com on 2019-02-21
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class TreeSetEx1 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();

        String from = "b";
        String to = "d";

        set.add("abc"); set.add("alien"); set.add("bat");
        set.add("car"); set.add("Car"); set.add("disc");
        set.add("dance"); set.add("dZZZZ"); set.add("dzzzz");
        set.add("elephant"); set.add("elevator"); set.add("fan");
        set.add("flower");

        System.out.println(set);
        System.out.println("Range search : from " + from + " to " + to);
        System.out.println("Result1 : " + set.subSet(from, to));
        System.out.println("Result2 : " + set.subSet(from, to + "zzz"));
    }
}
