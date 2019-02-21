package Collection_framework;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by bobsang89@gmail.com on 2019-02-20
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class TreeSetLotto {
    public static void main(String[] args){
        Set set = new TreeSet();

        for(int i =0; set.size() < 6; i++){
            int num = (int)(Math.random()*45)+1;
            set.add(num);
        }
        System.out.println(set);
    }
}
