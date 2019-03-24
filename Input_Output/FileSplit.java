package Input_Output;

import java.io.*;

/**
 * Created by bobsang89@gmail.com on 2019-03-23
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class FileSplit {
    public static void main(String[] args) {
        if(args.length < 2){
            System.out.println("USAGE : java FileSplit fileName SIZE_KB");
            System.exit(0);
        }

        final int VOLUME = Integer.parseInt(args[1]) * 1000;

        try{
            String fileName = args[0];
            FileInputStream fileInputStream = new FileInputStream(fileName);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

            FileOutputStream fileOutputStream = null;
            BufferedOutputStream bufferedOutputStream = null;

            int data = 0;
            int i = 0;
            int number = 0;

            while((data = bufferedInputStream.read()) != -1){
                if(i%VOLUME == 0){
                    if(i != 0){
                        bufferedOutputStream.close();
                    }
                    fileOutputStream = new FileOutputStream(fileName + "_." + ++number);
                    bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                }
                bufferedOutputStream.write(data);
                i++;
            }
            bufferedInputStream.close();
            bufferedOutputStream.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
