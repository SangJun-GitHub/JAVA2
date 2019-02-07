package Date_Time_Formatting;

import java.text.ChoiceFormat;

/**
 * Created by bobsang89@gmail.com on 2019-02-06
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class ChoiceFormatEx1 {
    public static void main(String[] args) {
        double[] limits = {60, 70, 80, 90};
        String[] grades = {"D", "C", "B", "A"};
        //must same number limits and grades

        int[] scores = {100, 95, 88, 75, 52, 60, 70};

        ChoiceFormat format = new ChoiceFormat(limits, grades);
        for(int i = 0; i <scores.length; i++){
            System.out.println(scores[i] + " : " + format.format(scores[i]));
        }
    }
}
