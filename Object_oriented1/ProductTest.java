package Object_oriented1;

/**
 * Created by bobsang89@gmail.com on 2018-12-25
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
class Product {
    static int count = 0;
    int serialNo;

    {
        ++count;
        serialNo = count;
    }
    public Product(){} //default constructor. Can be omitted

}
public class ProductTest{
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();

        System.out.println("the serial number of p1 : " + p1.serialNo);
        System.out.println("the serial number of p2 : " + p2.serialNo);
        System.out.println("the serial number of p3 : " + p3.serialNo);
        System.out.println("Total products are " + Product.count);

    }
}
