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
public class DataInputStreamEx2 {
    public static void main(String[] args) {
        int sum = 0;
        int score = 0;

        FileInputStream fileInputStream = null;
        DataInputStream dataInputStream = null;

        try{
            fileInputStream = new FileInputStream("score.dat");
            dataInputStream = new DataInputStream(fileInputStream);

            while(true){
                score = dataInputStream.readInt();
                System.out.println(score);
                sum += score;
            }
        }catch (EOFException e){
            System.out.println("The sum of score is " + sum);
        }catch (IOException ioe){
            ioe.printStackTrace();
        }finally {
            try{
                if(dataInputStream != null)
                    dataInputStream.close();
            }catch(IOException ioe){
                ioe.printStackTrace();
            }
        }

    }
}
