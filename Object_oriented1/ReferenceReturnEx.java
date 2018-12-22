package Object_oriented1;

/**
 * Created by bobsang89@gmail.com on 2018-12-20
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class ReferenceReturnEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;

        Data d2 = copy(d);      //d2 must be Data type because copy() return Data type
        System.out.println("d.x = " + d.x);
        System.out.println("d2.x = " + d2.x);

    }
    static Data copy(Data d){
        Data tmp = new Data();  //Create new Data
        tmp.x = d.x;            //Copy value from d.x to tmp.x
        return tmp;
    }
}
