package Exception_handling;

/**
 * Created by bobsang89@gmail.com on 2019-01-06
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class ExceptionEx1 {
    public static void main(String[] args) {

        //try1
        try {
            try {   } catch (Exception e){  }
        } catch(Exception e) {
//            try {} catch (Exception e){}      //error. same "e"
            try {   } catch (Exception e1){ }
        }

        //try2
        try{

        } catch (Exception e){      //try1 e and try2 e are different

        }
    }
}
