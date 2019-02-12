package Collection_framework;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by bobsang89@gmail.com on 2019-02-11
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class StackQueueEx {
    public static void main(String[] args){
        Stack stack = new Stack();
        Queue queue = new LinkedList(); // Use LinkedList, the implementation that interface of Queue.

        stack.push("0");
        stack.push("1");
        stack.push("2");

        queue.add("0");
        queue.add("1");
        queue.add("2");

        System.out.println("= Stack =");
        while(!stack.empty())
            System.out.println(stack.pop());
        //LIFO: Last in First out
        // boolean empty() - check empty
        // Object peek() - return last object but not remove at stack, if is not exist EmptyStackException
        // Object pop() - return last object, remove at stack
        // Object push(Object item)  - store item to stack
        // int search(Object object) - return index of object, if it is not exist return -1

        System.out.println("= Queue =");
        while(!queue.isEmpty())
            System.out.println(queue.poll());
        //FIFO: First in First out
        // boolean add(Object object) - return result of adding to queue, if is not exist IllegalStateException
        // Object remove() - return object/ remove, if is empty NoSuchElementException  *
        // Object element() - read object with out remove, if is empty NoSuchElementException *
        // boolean offer(Object object) - return true / false depend on result of store
        // Object poll() - return object, if is empty return null *
        // Object peek() - read  object with out remove, if is empty return null *
    }
}
