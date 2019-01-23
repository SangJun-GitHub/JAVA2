package Package_Utill;

import java.util.Random;

/**
 * Created by bobsang89@gmail.com on 2019-01-22
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class RandomEx2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] number = new int[100];
        int[] counter = new int[10];

        for(int i = 0; i < number.length; i++)
            //System.out.println(number[i] = (int)(Math.random() * 10));
            //0 <= x < 10 range
            System.out.print(number[i] = rand.nextInt(10));
        System.out.println();

        for(int i = 0; i < number.length; i++)
            counter[number[i]]++;

        for(int i = 0; i < counter.length; i++)
            System.out.println(i + "'s : " + printGraph('#',counter[i]) + " "+ counter[i]);

    }

    public static String printGraph(char ch, int value){
        char[] bar = new char[value];

        for(int i = 0; i < bar.length; i++)
            bar[i] = ch;

        return new String(bar);
    }
}
