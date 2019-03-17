package Input_Output;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * Created by bobsang89@gmail.com on 2019-03-16
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class DataOutputStreamEx2 {
    public static void main(String[] args) {
        ByteArrayOutputStream byteArrayOutputStream = null;
        DataOutputStream dataOutputStream = null;

        byte[] result = null;

        try{
            byteArrayOutputStream = new ByteArrayOutputStream();
            dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeInt(10);
            dataOutputStream.writeFloat(20.0f);
            dataOutputStream.writeBoolean(true);

            result = byteArrayOutputStream.toByteArray();

            String[] hex = new String[result.length];

            for(int i = 0; i < result.length; i++){
                if(result[i] < 0)
                    hex[i] = String.format("%02x", result[i]+256);
                else
                    hex[i] = String.format("%02x", result[i]);
            }

            System.out.println("Decimal numbers     : " + Arrays.toString(result));
            System.out.println("hexadecimal numbers : " + Arrays.toString(hex));

            dataOutputStream.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
