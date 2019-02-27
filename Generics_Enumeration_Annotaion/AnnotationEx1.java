package Generics_Enumeration_Annotaion;

/**
 * Created by bobsang89@gmail.com on 2019-02-27
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
class Parent{
    void parentMethod(){}
}
class Child extends Parent{
//    @Override
//    void parentmethod(){}             Error. method name is wrong.

    @Override
    void parentMethod(){}
}
public class AnnotationEx1 {

}
