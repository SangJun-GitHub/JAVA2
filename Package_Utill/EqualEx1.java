package Package_Utill;

/**
 * Created by bobsang89@gmail.com on 2019-01-14
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
class Value{
    int value;
    Value(int value){
        this.value = value;
    }
}
public class EqualEx1 {
    public static void main(String[] args) {
        Value v1 = new Value(10);
        Value v2 = new Value(10);

        if (v1.equals(v2))
            System.out.println("v1 and v2 are same");
        else
            System.out.println("v1 and v2 are different");

        v2 = v1;

        if (v1.equals(v2))
            System.out.println("v1 and v2 are same");
        else
            System.out.println("v1 and v2 are different");
    }
}
