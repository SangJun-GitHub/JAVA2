package Package_Utill;

/**
 * Created by bobsang89@gmail.com on 2019-01-16
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
class Card{
    String kind;
    int number;

    Card(){
        this("SPADE", 1);
    }

    Card(String kind, int number){
        this.kind = kind;
        this.number = number;
    }
}
public class CardToString {
    public static void main(String[] args) {
        Card c1 = new Card();
        Card c2 = new Card();

        System.out.println(c1.toString());
        System.out.println(c2.toString());

        //output is hashcode, because we did not overriding toString()
    }
}
