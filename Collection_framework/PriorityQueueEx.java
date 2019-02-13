package Collection_framework;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by bobsang89@gmail.com on 2019-02-13
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class PriorityQueueEx {
    public static void main(String[] args) {
        Queue priorityQueue = new PriorityQueue();
        priorityQueue.offer(3);                 //priorityQueue.offer(new Integer(3));      autoboxing
        priorityQueue.offer(1);
        priorityQueue.offer(5);
        priorityQueue.offer(2);
        priorityQueue.offer(4);
        System.out.println(priorityQueue);

        Object object = null;
        while((object = priorityQueue.poll()) != null)
            System.out.println(object);
    }
}
