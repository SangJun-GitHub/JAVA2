package Collection_framework;

import java.util.ArrayList;
import java.util.Iterator;



/**
 * Created by bobsang89@gmail.com on 2019-02-13
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class IteratorEx2 {
    public static void main(String[] args) {
        ArrayList original = new ArrayList(10);
        ArrayList copy1 = new ArrayList(10);
        ArrayList copy2 = new ArrayList(10);

        for(int i = 0; i < 10; i++)
            original.add(((int) (Math.random() * 10) + 1) + "");

        Iterator iterator = original.listIterator();

        while(iterator.hasNext())
            copy1.add(iterator.next());
        System.out.println("=== Copy elements from original to copy1 ===");
        System.out.println("original: " + original);
        System.out.println("copy1: " + copy1);
        System.out.println();

        iterator = original.iterator();             //Iterator cannot reuse so we should take again

        while(iterator.hasNext()) {
            copy2.add(iterator.next());
            iterator.remove();                      //remove original's element
        }
        System.out.println("=== Copy elements from original to copy2 ===");
        System.out.println("original: " + original);
        System.out.println("copy2: " + copy2);
        System.out.println();
    }
}
