package Object_oriented1;

/**
 * Created by bobsang89@gmail.com on 2018-12-25
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class BlockTest {
    static {
        System.out.println("static {}"); // Class initialization block
    }

    {
        System.out.println("{}"); // Instance initialization block
    }

    public BlockTest(){
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        System.out.println("BlockTest bt1 = new BlockTest(); ");
        BlockTest bt1 = new BlockTest();

        System.out.println("BlockTest bt2 = new BlockTest(); ");
        BlockTest bt2 = new BlockTest();
    }
}
