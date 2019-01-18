package Package_Utill;

import java.util.Arrays;

/**
 * Created by bobsang89@gmail.com on 2019-01-18
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class CloneEx2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] arrClone = arr.clone();
        arrClone[0] = 6;

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrClone));
    }
}
