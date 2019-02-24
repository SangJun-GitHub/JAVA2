package Collection_framework;

import java.util.*;

/**
 * Created by bobsang89@gmail.com on 2019-02-23
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class TreeMapEx1 {
    public static void main(String[] args) {
        String[] data = {"A","K","A","K","D","K","A","K","K","K","Z","D"};

        TreeMap map = new TreeMap();

        for(int i = 0; i < data.length; i++){
            if (map.containsKey(data[i])) {
                Integer value = (Integer)map.get(data[i]);
           map.put(data[i], new Integer(value.intValue() + 1));
            }else{
                map.put(data[i], new Integer(1));
            }
        }
        Iterator iterator = map.entrySet().iterator();

        System.out.println("=== Default Short ===");
        while(iterator.hasNext()){
            Map.Entry entry = (Map.Entry)iterator.next();
            int value = ((Integer)entry.getValue()).intValue();
            System.out.println(entry.getKey() + " : " + printBar('#', value) + " " + value);
        }
        System.out.println();

        // map -> ArrayList. then Collections.sort()
        Set set = map.entrySet();
        List list = new ArrayList(set);

        //static void sort(List list, Comparator c)
        Collections.sort(list, new ValueComparator());

        iterator = list.iterator();
        System.out.println("=== Descending ===");
        while(iterator.hasNext()){
            Map.Entry entry = (Map.Entry)iterator.next();
            int value = ((Integer)entry.getValue()).intValue();
            System.out.println(entry.getKey() + " : " + printBar('#', value) + " " + value);
        }
    }

    static class ValueComparator implements Comparator{
        public int compare(Object o1, Object o2){
            if(o1 instanceof Map.Entry && o2 instanceof  Map.Entry){
                Map.Entry e1 = (Map.Entry)o1;
                Map.Entry e2 = (Map.Entry)o2;

                int v1 = ((Integer)e1.getValue()).intValue();
                int v2 = ((Integer)e2.getValue()).intValue();

                return v2 - v1;
            }
            return -1;
        }
    }

    public static String printBar(char ch, int value){
        char[] bar = new char[value];

        for(int i = 0; i < bar.length; i++){
            bar[i] = ch;
        }
        return new String(bar);
    }
}
