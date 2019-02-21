package Collection_framework;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by bobsang89@gmail.com on 2019-02-20
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class HashSetEx1 {
    public static void main(String[] args){
        Object[] objArr = {"1", new Integer(1), "2", "2", "3", "3", "4", "4", "4"};
        Set set = new HashSet();

        for(int i = 0; i < objArr.length; i++)
            set.add(objArr[i]);

        System.out.println(set);
    }
}
