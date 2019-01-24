package Package_Utill;

import java.io.File;
import java.util.Scanner;

/**
 * Created by bobsang89@gmail.com on 2019-01-24
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class ScannerEx2 {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(new File("./src/Package_Utill/data2.txt"));
        int sum = 0;
        int count = 0;

        while (scanner.hasNextInt()){
            sum += scanner.nextInt();
            count++;
        }

        System.out.println("sum : " + sum);
        System.out.println("average : " + (double)sum/count);
    }
}
