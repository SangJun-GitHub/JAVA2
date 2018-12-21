package Object_oriented1;

/**
 * Created by bobsang89@gmail.com on 2018-12-20
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class ReturnTest {
    public static void main(String[] args) {
        ReturnTest r = new ReturnTest();

        int result = r.add(3,5);
        System.out.println(result);

        int[] result2 = {0}; //Create array[0] then initialize to 0
        r.add(3,5, result2);
        System.out.println(result2[0]);
    }
    int add(int a, int b){
        return a+b;
    }
    void add(int a, int b, int[] result){
        result[0] = a+b;
    }
}
