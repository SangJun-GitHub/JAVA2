package Collection_framework;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by bobsang89@gmail.com on 2019-02-19
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class ComparatorEx {
    public static void main(String[] args) {
        String[] strArr = {"cat", "Dog", "lion", "tiger"};

        Arrays.sort(strArr);        //by Comparable of String
        System.out.println("strArr=" + Arrays.toString(strArr));

        Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); //ignore case
        System.out.println("strArr=" + Arrays.toString(strArr));

        Arrays.sort(strArr, new Descending());       //reverse sort
        System.out.println("strArr=" + Arrays.toString(strArr));
    }
}
class Descending implements Comparator{
    public int compare(Object o1, Object o2){
        if(o1 instanceof Comparable && o2 instanceof Comparable){
            Comparable c1 = (Comparable)o1;
            Comparable c2 = (Comparable)o2;
            return c1.compareTo(c2) * -1;           // or c2.compareTo(c1)
        }
        return -1;
    }
}
