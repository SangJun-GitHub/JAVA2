package Collection_framework;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by bobsang89@gmail.com on 2019-02-12
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class ExpValidCheck {
    public static void main(String[] args) {
        if(args.length != 1){
            System.out.println("Usage : java ExpValidCheck \"EXPRESSION\"");
            System.out.println("Example : java ExpValidCheck \"((2+3)*1)+1\"");
            System.exit(0);
        }
        Stack stack = new Stack();
        String expression = args[0];

        System.out.println("expression: " + expression);

        try{
            for(int i =0; i < expression.length(); i++){
                char ch = expression.charAt(i);
                if(ch =='('){
                    stack.push(ch+"");
                }else if(ch ==')') {
                    stack.pop();
                }
            }
            if(stack.isEmpty()){
                System.out.println("Bracket match");
            }else{
                System.out.println("Bracket do not match");
            }
        }catch (EmptyStackException e){
            System.out.println("Bracket do not match");
        }
    }
}
