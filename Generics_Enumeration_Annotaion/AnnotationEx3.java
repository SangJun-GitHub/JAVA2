package Generics_Enumeration_Annotaion;

import java.util.ArrayList;

/**
 * Created by bobsang89@gmail.com on 2019-02-27
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
class NewClass3{
    int newField;

    int getNewField(){
        return newField;
    }

    @Deprecated
    int oldField;

    @Deprecated
    int getOldField(){
        return oldField;
    }
}
public class AnnotationEx3 {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        NewClass3 newClass = new NewClass3();

        newClass.oldField =10;
        System.out.println(newClass.getOldField());

        @SuppressWarnings("unchecked")
        ArrayList<NewClass3> list = new ArrayList();
        list.add(newClass);
    }
}
