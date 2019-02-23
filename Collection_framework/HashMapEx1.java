package Collection_framework;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by bobsang89@gmail.com on 2019-02-22
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class HashMapEx1 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("myId", "1234");
        map.put("asdf", "1111");
        map.put("asdf", "1234");

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Enter id and password");
            System.out.println("id :");
            String id = scanner.nextLine().trim();

            System.out.println("password :");
            String password = scanner.nextLine().trim();
            System.out.println();

            if(!map.containsKey(id)){
                System.out.println("Entered id is not existed. Enter again");
                continue;
            }else{
                if(!(map.get(id)).equals(password)){
                    System.out.println("Password is not matched to id. Enter again");
                }else{
                    System.out.println("Match id and password");
                    break;
                }
            }
        }
    }
}
