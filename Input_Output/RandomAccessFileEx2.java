package Input_Output;

import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by bobsang89@gmail.com on 2019-03-20
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class RandomAccessFileEx2 {
    public static void main(String[] args) {
        //              Number, English, Mathematics, History
        int[] score = { 1, 100,  90,  90,
                        2,  70,  90, 100,
                        3, 100, 100, 100,
                        4,  70,  60,  80,
                        5,  70,  90, 100
        };

        try{
            RandomAccessFile randomAccessFile = new RandomAccessFile("score2.dat", "rw");
            for(int i = 0; i < score.length; i++)
                randomAccessFile.writeInt(score[i]);

            while(true)
                System.out.println(randomAccessFile.readInt());

        }catch(EOFException eofe){
            //when we call readInt() but does not have content, EOFException occur.
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
