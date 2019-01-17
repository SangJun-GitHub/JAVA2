package Package_Utill;

/**
 * Created by bobsang89@gmail.com on 2019-01-16
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
class Point implements Cloneable{
    int x, y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "x=" + x + " y=" + y;
    }

    public Object clone(){
        Object obj = null;
        try{
            obj = super.clone();        //when we use clone(), we have to consider exception
        }catch(CloneNotSupportedException e){

        }
        return obj;
    }
}
public class CloneEx1 {
    public static void main(String[] args) {
        Point original = new Point(3, 5);
        Point copy = (Point)original.clone();       //copy(clone), then create new object
        System.out.println(original);
        System.out.println(copy);
    }
}
