package Input_Output;

import java.io.*;

/**
 * Created by bobsang89@gmail.com on 2019-03-23
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class FileMerge {
    public static void main(String[] args) {
        if(args.length != 1){
            System.out.println("USAGE : java FileMerge fileName");
            System.exit(0);
        }

        String mergeFileName = args[0];

        try{
            File tempFile = File.createTempFile("~mergetemp",".tmp");
            tempFile.deleteOnExit();

            FileOutputStream fileOutputStream = new FileOutputStream(tempFile);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

            BufferedInputStream bufferedInputStream = null;

            int number = 1;
            File file = new File(mergeFileName + "_." + number);

            while(file.exists()){
                file.setReadOnly();
                bufferedInputStream = new BufferedInputStream(new FileInputStream(file));

                int data = 0;
                while((data = bufferedInputStream.read()) != -1){
                    bufferedOutputStream.write(data);
                }

                bufferedInputStream.close();

                file = new File(mergeFileName + "_." + ++number);
            }

            bufferedOutputStream.close();

            File oldFile = new File(mergeFileName);
            if(oldFile.exists()){
                oldFile.delete();
            }
            tempFile.renameTo(oldFile);
        }catch(IOException e){}
    }
}
