package Date_Time_Formatting;

import java.text.DecimalFormat;

/**
 * Created by bobsang89@gmail.com on 2019-02-05
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class DecimalFormatEx1 {
    public static void main(String[] args) {
        double number = 1234567.89;
        String[] pattern = {
                "0",
                "#",
                "0.0",
                "#.#",
                "0000000000.0000",
                "##########.####",
                "#.#-",
                "-#.#",
                "#,###.##",
                "#,####.##",
                "#E0",
                "0E0",
                "##E0",
                "00E0",
                "####E0",
                "0000E0",
                "#.#E0",
                "0.0E0",
                "0.000000000E0",
                "00.00000000E0",
                "000.0000000E0",
                "#.#########E0",
                "##.########E0",
                "###.#######E0",
                "#,###.##+;#,###.##-",
                "#.#%",
                "#.#\u2030",
                "\u00A4 #,###",
                "'#'#,###",
                "''#,###",
        };
        for(int i = 0; i < pattern.length; i++){
            DecimalFormat df = new DecimalFormat(pattern[i]);
            System.out.printf("%19s : %s\n", pattern[i], df.format(number));
        }
    }
}
