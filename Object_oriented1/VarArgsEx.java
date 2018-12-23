package Object_oriented1;

/**
 * Created by bobsang89@gmail.com on 2018-12-22
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class VarArgsEx {
    public static void main(String[] args) {
        String[] strArr = { "100", "200", "300"};
        System.out.println(concatenate(",", "100", "200", "300"));
        System.out.println(concatenate("-", strArr));
        System.out.println(concatenate(",", new String[] {"1", "2", "3"}));
        System.out.println("["+concatenate(",", new String[0]) +"]");
        System.out.println("["+concatenate(",")+"]");
    }

    static String concatenate(String delim, String... args){
        String result = "";

        for(String str : args)
            result += str + delim;

        return result;
    }

    /*
    static String concatenate(String... args){
        return concatenate("", args);
    }
    */

    //if we overloading the method which uses varargs, when we call the method, the compiler cannot distinguish method.
    //Therefore, when we use varargs, avoid using the overloading method

}
