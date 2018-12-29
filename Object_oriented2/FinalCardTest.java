package Object_oriented2;

/**
 * Created by bobsang89@gmail.com on 2018-12-28
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
class Card2 {
    final int NUMBER;
    final String KIND;
    static int width = 100;
    static int height = 250;

    Card2(String kind, int num){
        KIND = kind;
        NUMBER = num;
    }

    Card2(){
        this("HEART", 1);
    }

    public String toString() {
        return KIND + " " + NUMBER;
    }
}
public class FinalCardTest {
    public static void main(String[] args) {
        Card2 c = new Card2("HEART", 10);
//        c.NUMBER = 5;     //error. cannot assign a value to final variable NUMBER
        System.out.println(c.KIND);
        System.out.println(c.NUMBER);
        System.out.println(c);

    }
}
