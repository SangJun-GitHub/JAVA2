package Collection_framework;

import java.util.TreeSet;

/**
 * Created by bobsang89@gmail.com on 2019-02-21
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class TreeSetEx2 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();
        int[] score = {80, 95, 50, 35, 45, 65, 10, 100};

        for(int i = 0; i < score.length; i++)
            set.add(new Integer(score[i]));

        System.out.println(set);
        System.out.println("values less thn 50 : " + set.headSet(new Integer(50)));
        System.out.println("values greater than 50 : " + set.tailSet(new Integer(50)));
    }
}
