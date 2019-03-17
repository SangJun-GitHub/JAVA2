package Input_Output;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by bobsang89@gmail.com on 2019-03-17
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class DataInputStreamEx3 {
    public static void main(String[] args) {
        int sum = 0;
        int score = 0;

        try(FileInputStream fileInputStream = new FileInputStream("score.dat");
            DataInputStream dataInputStream = new DataInputStream(fileInputStream)){

            while(true){
                score = dataInputStream.readInt();
                System.out.println(score);
                sum += score;
            }
        }catch(EOFException e){
            System.out.println("The sum of score is " + sum);
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
}
