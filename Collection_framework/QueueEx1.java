package Collection_framework;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by bobsang89@gmail.com on 2019-02-12
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class QueueEx1 {
    static Queue queue = new LinkedList();
    static final int MAX_SIZE = 5;

    public static void main(String[] args){
        System.out.println("Type 'help', if you need tips");

        while (true){
            System.out.println(">>");
            try{
                Scanner scanner = new Scanner(System.in);
                String input = scanner.nextLine().trim();

                if("".equals(input))
                    continue;

                if(input.equalsIgnoreCase("exit")){
                    System.exit(0);
                }else if (input.equalsIgnoreCase("help")){
                    System.out.println("exit - Exit the program");
                    System.out.println("history - display recently typed");
                } else if(input.equalsIgnoreCase("history")){
                    int i = 0;
                    save(input);

                    LinkedList tmp = (LinkedList)queue;
                    ListIterator it = tmp.listIterator();

                    while (it.hasNext())
                        System.out.println(++i+"."+it.next());
                } else{
                    save(input);
                    System.out.println(input);
                }
            }catch(Exception error){
                System.out.println("Error type");
            }
        }
    }

    public static void save(String input){
        if(!"".equals(input))
            queue.offer(input);

        if(queue.size() > MAX_SIZE)
            queue.remove();
    }
}
