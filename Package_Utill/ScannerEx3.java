package Package_Utill;

import java.io.File;
import java.util.Scanner;

/**
 * Created by bobsang89@gmail.com on 2019-01-24
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class ScannerEx3 {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(new File("./src/Package_Utill/data3.txt"));
        int count = 0;
        int total = 0;

        while(scanner.hasNextInt()){
            String line = scanner.nextLine();
            Scanner scanner2 = new Scanner(line).useDelimiter(",");
            int sum = 0;

            while(scanner2.hasNextInt()){
                sum += scanner2.nextInt();
            }
            System.out.println(line + ", sum = " + sum);
            total += sum;
            count++;
        }
        System.out.println("Line : " + count + ", Total : " + total);
    }
}
