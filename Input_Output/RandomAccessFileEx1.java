package Input_Output;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by bobsang89@gmail.com on 2019-03-20
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class RandomAccessFileEx1 {
    public static void main(String[] args) {
        try{
            RandomAccessFile randomAccessFile = new RandomAccessFile("test.dat", "rw");
            System.out.println("The location of file pointer is : " + randomAccessFile.getFilePointer());
            randomAccessFile.writeInt(100);
            System.out.println("The location of file pointer is : " + randomAccessFile.getFilePointer());
            randomAccessFile.writeLong(100L);
            System.out.println("The location of file pointer is : " + randomAccessFile.getFilePointer());
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
