package Input_Output;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Created by bobsang89@gmail.com on 2019-03-22
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class FileEx7 {
    public static void main(String[] args) throws Exception {
        if(args.length != 1){
            System.out.println("USAGE : java FileEx6 pattern");
            System.exit(0);
        }

        String currDir = System.getProperty("user.dir");

        File dir = new File(currDir);
        final String pattern = args[0];

        String[] files = dir.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.indexOf(pattern) != -1;
            }
        });

        for(int i = 0; i < files.length; i++){
            System.out.println(files[i]);
        }
    }
}
