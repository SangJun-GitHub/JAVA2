package Collection_framework;

import java.util.Vector;

/**
 * Created by bobsang89@gmail.com on 2019-02-09
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class VectorEx1 {
    public static void main(String[] args) {
        Vector v = new Vector(5);
        v.add("1");
        v.add("2");
        v.add("3");
        print(v);

        v.trimToSize();
        System.out.println("=== After trimToSize() ===");
        print(v);

        v.ensureCapacity(6);
        System.out.println("=== After ensureCapacity(6) ===");
        print(v);

        v.setSize(7);
        System.out.println("=== After setSize(7) ===");
        print(v);

        v.clear();
        System.out.println("=== After clear() ===");
        print(v);
    }
    static void print(Vector v){
        System.out.println(v);
        System.out.println("Size:" + v.size());
        System.out.println("Capacity:" + v.capacity());
    }
}
