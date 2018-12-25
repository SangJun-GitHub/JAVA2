package Object_oriented1;

/**
 * Created by bobsang89@gmail.com on 2018-12-24
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
class Data1{
    int value;
}
class Data2{
    int value;
    Data2(int x){ value = x; }
}
public class ConstructorTest {
    public static void main(String[] args) {
        Data1 d1 = new Data1();
        //Data2 d2 = new Data2(); //error. Data2 constructor need argument
        Data2 d2 = new Data2(d1.value);
        Data2 d3 = new Data2(10);
        //default constructor only add when no constructor in the class
    }
}
