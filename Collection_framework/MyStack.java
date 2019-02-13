package Collection_framework;

import java.util.*;

/**
 * Created by bobsang89@gmail.com on 2019-02-12
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class MyStack extends Vector {
    public Object push(Object item){
        addElement(item);
        return item;
    }
    public Object pop(){
        Object object = peek();                 //if stack is empty, the peek() method generate EmptyStackException
        removeElement(size() - 1);          //Remove last element. Array star with 0, for index should add -1
        return object;
    }
    public Object peek(){
        int len = size();
        if(len == 0)
            throw new EmptyStackException();
        return elementAt(len - 1);          //Return the last element. Array star with 0, for index should add -1
    }

    public boolean empty(){
        return size() == 0;
    }
    public int search (Object object){
        int i = lastIndexOf(object);            //Find object from last element.
                                                
        if( i >= 0)
            return size() - i;
        return -1;                              //if the search() method could not find object, return -1
    }
}
