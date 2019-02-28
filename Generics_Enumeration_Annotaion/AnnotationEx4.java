package Generics_Enumeration_Annotaion;

import java.util.Arrays;

/**
 * Created by bobsang89@gmail.com on 2019-02-28
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
class MyArrayList<T>{
    T[] array;

    @SafeVarargs
    @SuppressWarnings("varargs")
    MyArrayList(T... array){
        this.array = array;
    }

    @SafeVarargs
    @SuppressWarnings("unchecked")
    public static <T> MyArrayList<T> asList(T... a){
        return new MyArrayList<>(a);
    }

    public String toString(){
        return Arrays.toString(array);
    }
}
public class AnnotationEx4 {
    @SuppressWarnings("nuchecked")
    public static void main(String[] args) {
        MyArrayList<String> list = MyArrayList.asList("1", "2", "3");

        System.out.println(list);
    }
}
