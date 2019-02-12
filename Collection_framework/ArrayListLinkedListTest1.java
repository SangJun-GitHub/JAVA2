package Collection_framework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by bobsang89@gmail.com on 2019-02-11
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class ArrayListLinkedListTest1 {
    public static void main (String[] args){
        ArrayList al = new ArrayList(2000000);
        LinkedList ll = new LinkedList();


        System.out.println("= Add orderly =");
        System.out.println("ArrayList : "+add1(al));
        System.out.println("LinkedList: "+add1(ll));

        System.out.println("= Add at center =");
        System.out.println("ArrayList : "+add2(al));
        System.out.println("LinkedList: "+add2(ll));

        System.out.println("= Remove at center =");
        System.out.println("ArrayList : "+remove2(al));
        System.out.println("LinkedList: "+remove2(ll));

        System.out.println("= Remove orderly =");
        System.out.println("ArrayList : "+remove1(al));
        System.out.println("LinkedList: "+remove1(ll));

        //Basically, it means ArrayList is faster at orderly works but slower at center start

    }
    public static long add1(List list){
        long start = System.currentTimeMillis();
        for(int i = 0; i<1000000; i++)
            list.add(i+"");
        long end = System.currentTimeMillis();
        return end - start;
    }

    public static long add2(List list){
        long start = System.currentTimeMillis();
        for(int i =0; i<10000; i++)
            list.add(500, "X");
        long end = System.currentTimeMillis();
        return end - start;
    }

    public static long remove1(List list){
        long start = System.currentTimeMillis();
        for(int i = list.size()-1; i >=0; i--)
            list.remove(i);
        long end = System.currentTimeMillis();
        return end - start;
    }

    public static long remove2(List list){
        long start = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++)
            list.remove(i);
        long end = System.currentTimeMillis();
        return end - start;

    }
}
