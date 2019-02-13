package Collection_framework;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by bobsang89@gmail.com on 2019-02-13
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class IteratorEx1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("5");
        list.add("4");
        list.add("10");


        Iterator iterator = list.iterator();

        while(iterator.hasNext()){
            Object object = iterator.next();
            System.out.println(object);
        }
    }
}
