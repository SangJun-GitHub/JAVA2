package Object_oriented2;

/**
 * Created by bobsang89@gmail.com on 2018-12-27
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
class Point2 {
   int x = 10;
   int y = 20;
   Point2(){}
   Point2(int x, int  y) {
       super();
       this.x = x;
       this.y = y;
   }
   String getLocation() {
       return "x : " + x + ", y : " + y;
   }
}

class Point3D extends Point2 {
    int z = 30;
    Point3D() {
        this(100,200,300);  //call Point3D(int x, int y, int z)
    }
    Point3D(int x, int y, int z) {
        super(x, y);                //call Point(int x, int y)
        this.z = z;
    }
    String getLocation() { //overriding
        return "x : " + x + ", y : " + y + ", z : " + z;
    }
}

public class PointTest {
    public static void main(String[] args) {
        Point3D p3 = new Point3D();
        System.out.println("p3 = " + p3.getLocation());
        System.out.println("p3.x : " +p3.x);
        System.out.println("p3.y : " +p3.y);
        System.out.println("p3.z : " +p3.z);

        Point2 p = new Point2();
        System.out.println("p = " + p.getLocation());
        System.out.println("p.x : " + p.x);
        System.out.println("p.y : " + p.y);
    }
}
