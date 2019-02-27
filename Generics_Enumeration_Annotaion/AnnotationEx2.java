package Generics_Enumeration_Annotaion;

/**
 * Created by bobsang89@gmail.com on 2019-02-27
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
class NewClass{
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
public class AnnotationEx2 {
    public static void main(String[] args) {
        NewClass newClass = new NewClass();

        newClass.oldField = 10;
        System.out.println(newClass.getOldField());
    }
}
