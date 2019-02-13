package Collection_framework;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Created by bobsang89@gmail.com on 2019-02-13
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class ListIteratorEx1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("2");
        list.add("3");
        list.add("5");
        list.add("5");
        list.add("4");

        ListIterator iterator = list.listIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println();
        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
    }
}
