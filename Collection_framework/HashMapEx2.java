package Collection_framework;

import java.util.*;

/**
 * Created by bobsang89@gmail.com on 2019-02-22
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class HashMapEx2 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("Sang", new Integer(90));
        map.put("Sang", new Integer(100));
        map.put("Jun", new Integer(100));
        map.put("Park", new Integer(80));

        Set set = map.entrySet();
        Iterator iterator = set.iterator();

        while(iterator.hasNext()){
            Map.Entry e = (Map.Entry)iterator.next();
            System.out.println("Name : " + e.getKey() + ", Score : "+ e.getValue());
        }
        set = map.keySet();
        System.out.println("Entry List : " + set);

        Collection values = map.values();
        iterator = values.iterator();

        int total = 0;
        while (iterator.hasNext()){
            Integer i = (Integer)iterator.next();
            total += i.intValue();
        }
        System.out.println("Total : " + total);
        System.out.println("Average : " + (float)total/set.size());
        System.out.println("Highest : " + Collections.max(values));
        System.out.println("Lowest : " + Collections.min(values));
    }
}
