package Object_oriented1;

/**
 * Created by bobsang89@gmail.com on 2018-12-19
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
class Card{
    String kind;
    int number;
    static int width = 100;
    static int height = 250;
}

public class CardTest {
    public static void main(String[] args) {
        System.out.println("Card.width is " + Card.width);
        System.out.println("Card.height is " + Card.height);

        Card c1 = new Card();
        c1.kind = "HEART";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "SPADE";
        c2.number = 4;

        System.out.println("c1 is "+ c1.kind + c1.number + ", width and height is " + c1.width + " " + c1.height);
        System.out.println("c2 is "+ c2.kind + c2.number + ", width and height is " + c2.width + " " + c2.height);

        System.out.println("c1's width and height change to 50 and 80");
        c1.width = 50;
        c1.height = 80;

        System.out.println("c1 is "+ c1.kind + c1.number + ", width and height is " + c1.width + " " + c1.height);
        System.out.println("c2 is "+ c2.kind + c2.number + ", width and height is " + c2.width + " " + c2.height);
    }
}
