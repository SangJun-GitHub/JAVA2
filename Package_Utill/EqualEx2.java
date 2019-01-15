package Package_Utill;

/**
 * Created by bobsang89@gmail.com on 2019-01-14
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
class Person{
    long id;

    public boolean equals(Object obj){
        if(obj != null && obj instanceof Person)
            return id == ((Person)obj).id;
        else
            return false;
    }

    Person(long id){
        this.id = id;
    }
}
public class EqualEx2 {
    public static void main(String[] args) {
        Person p1 = new Person(8011081111222L);
        Person p2 = new Person(8011081111222L);

        System.out.println("==");
        if(p1 == p2)
            System.out.println("p1 and p2 are same person");
        else
            System.out.println("p1 and p2 are different person");

        System.out.println("equals");
        if(p1.equals(p2))
            System.out.println("p1 and p2 are same person");
        else
            System.out.println("p1 and p2 are different person");
    }
}
