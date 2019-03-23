package Input_Output;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by bobsang89@gmail.com on 2019-03-22
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class FileEx4 {
    public static void main(String[] args) {
        String currDir = System.getProperty("user.dir");
        File dir = new File(currDir);

        File[] files = dir.listFiles();

        for(int i = 0; i < files.length; i++){
            File file = files[i];
            String name = file.getName();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mma");
            String attribute = "";
            String size = "";

            if(files[i].isDirectory()){
                attribute = "DIR";
            }else {
                size = file.length() + "";
                attribute = file.canRead() ? "R" : " ";
                attribute += file.canWrite() ? "W" : " ";
                attribute += file.isHidden() ? "H" : " ";
            }

            System.out.printf("%s %3s %6s %s\n", dateFormat.format(new Date(file.lastModified())), attribute, size, name);
        }
    }
}
