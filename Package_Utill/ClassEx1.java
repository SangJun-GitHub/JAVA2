package Package_Utill;

/**
 * Created by bobsang89@gmail.com on 2019-01-18
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */

final class Card3{
    String kind;
    int number;

    Card3(){
        this("SPADE", 1);
    }

    Card3(String kind, int number){
        this.kind = kind;
        this.number = number;
    }

    @Override
    public String toString(){
        return kind + ":" + number;
    }

}
public class ClassEx1 {
    public static void main(String[] args) throws Exception {
        Card3 c1 = new Card3("HEART",3);
        Card3 c2 = Card3.class.newInstance();       //need Exception

        Class cObj = c1.getClass();

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(cObj.getName());
        System.out.println(cObj.toGenericString());
        System.out.println(cObj.toString());
    }
}
