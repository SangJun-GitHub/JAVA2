package Package_Utill;

/**
 * Created by bobsang89@gmail.com on 2019-01-19
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class StringEx5 {
    public static void main(String[] args) {
        int iVal = 100;

        String sVal = String.valueOf(iVal);     //convert int to String

        double dVal = 200.0;
        String sVal2 = dVal+"";    //convert double to String

        double sum = Integer.parseInt("+"+sVal)+Double.parseDouble(sVal2);
        double sum2 = Integer.valueOf(sVal)+Double.parseDouble(sVal2);

        System.out.println(String.join("",sVal,"+",sVal2,"=")+sum);
        System.out.println(sVal+"+"+sVal2+"="+sum2);

    }
}
