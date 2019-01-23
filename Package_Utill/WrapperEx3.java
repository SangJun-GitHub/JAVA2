package Package_Utill;

/**
 * Created by bobsang89@gmail.com on 2019-01-22
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class WrapperEx3 {
    public static void main(String[] args) {
        int i = 10;

        //primitive type to reference type (casting can be omitted)
        Integer intg = (Integer)i;      //Integer intg = Integer.valueOf(i);
        Object obj = (Object)i;         //Object obj = (Object)Integer.valueOf(i);

        Long lng = 100L;                //Long lng = new Long(100L);

        int i2 = intg + 10;             //Can operate between reference type and primitive type
        long l = intg + lng;            //Can be added between reference types

        Integer intg2 = new Integer(20);
        int i3 = (int)intg2;            //reference type to primitive type (casting can be omitted)

        Integer intg3 = intg2 + i3;

        System.out.println("i           ="+i);
        System.out.println("intg        ="+intg);
        System.out.println("obj         ="+obj);
        System.out.println("lng         ="+lng);
        System.out.println("intg + 10   ="+i2);
        System.out.println("intg + lng  ="+l);
        System.out.println("intg2       ="+intg2);
        System.out.println("i3          ="+i3);
        System.out.println("intg2 + i3  ="+intg3);

    }
}
