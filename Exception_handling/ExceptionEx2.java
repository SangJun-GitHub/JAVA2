package Exception_handling;

/**
 * Created by bobsang89@gmail.com on 2019-01-07
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class ExceptionEx2 {
    public static void main(String[] args) {
        int number = 100;
        int result = 0;

        for(int i = 0; i < 10; i++){
            try {
                result = number / (int) (Math.random() * 10);
                System.out.println(result);
            }catch(ArithmeticException e){
                System.out.println("0");
            }
        }
    }
}
