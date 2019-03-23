package Input_Output;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

/**
 * Created by bobsang89@gmail.com on 2019-03-22
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class FileEx5 {
    public static void main(String[] args) {
        if(args.length != 1 || args[0].length() != 1 || "tTlLnN".indexOf(args[0]) == -1){
            System.out.println("USAGE : java FileEx5 SORT_OPTION");
            System.out.println("    SORT_OPTION:                ");
            System.out.println("    t   Time ascending sort.    ");
            System.out.println("    T   Time descending sort.   ");
            System.out.println("    l   Length ascending sort.  ");
            System.out.println("    L   Length descending sort. ");
            System.out.println("    n   Time ascending sort.    ");
            System.out.println("    N   Name descending sort.   ");
        }

        final char option = args[0].charAt(0);

        String currDir = System.getProperty("user.dir");
        File dir = new File(currDir);
        File[] files = dir.listFiles();

        Comparator comp = new Comparator(){
            public int compare(Object o1, Object o2){
                long time1 = ((File)o1).lastModified();
                long time2 = ((File)o2).lastModified();

                long length1 = ((File)o1).length();
                long length2 = ((File)o2).length();

                String name1 = ((File)o1).getName().toLowerCase();
                String name2 = ((File)o2).getName().toLowerCase();

                int result = 0;

                switch (option){
                    case 't' :
                        if(time1 - time2 > 0) result = 1;
                        else if(time1 - time2 == 0) result = 0;
                        else if(time1 - time2 < 0) result = -1;
                        break;
                    case 'T' :
                        if(time1 - time2 > 0) result = -1;
                        else if(time1 - time2 == 0) result = 0;
                        else if(time1 - time2 < 0) result = 1;
                        break;
                    case 'l' :
                        if(length1 - length2 > 0) result = 1;
                        else if(length1 - length2 == 0) result = 0;
                        else if(length1 - length2 < 0) result = -1;
                        break;
                    case 'L' :
                        if(length1 - length2 > 0) result = -1;
                        else if(length1 - length2 == 0) result = 0;
                        else if(length1 - length2 < 0) result = 1;
                        break;
                    case 'n' :
                        result = name1.compareTo(name2);
                        break;
                    case 'N' :
                        result = name2.compareTo(name1);
                        break;
                }
                return result;
            }

            public boolean equals(Object o){
                return false;
            }
        };

        Arrays.sort(files, comp);

        for(int i = 0; i < files.length; i++){
            File file = files[i];
            String name = file.getName();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            String attribute = "";
            String size = "";

            if (files[i].isDirectory()){
                attribute = "DIR";
            }else{
                size = file.length() + "";
                attribute = file.canRead() ? "R" : " ";
                attribute += file.canWrite() ? "W" : " ";
                attribute += file.isHidden() ? "H" : " ";
            }
            System.out.printf("%s %3s %6s %s\n", dateFormat.format(new Date(file.lastModified())), attribute, size, name);
        }
    }
}
