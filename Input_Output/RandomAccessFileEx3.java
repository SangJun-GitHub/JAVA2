package Input_Output;

import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by bobsang89@gmail.com on 2019-03-21
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class RandomAccessFileEx3 {
    public static void main(String[] args) {
        int sum = 0;

        try{
            RandomAccessFile randomAccessFile = new RandomAccessFile("score2.dat", "rw");
            int i = 4;

            while(true){
                randomAccessFile.seek(i);
                sum += randomAccessFile.readInt();
                i += 16;
            }
        }catch(EOFException e){
            System.out.println("sum : " + sum);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
