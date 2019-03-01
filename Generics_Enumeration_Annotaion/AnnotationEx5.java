package Generics_Enumeration_Annotaion;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by bobsang89@gmail.com on 2019-02-28
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
enum TestType{ FIRST, FINAL }

@Retention(RetentionPolicy.RUNTIME)
@interface DateTime{
    String yymmdd();
    String hhmmss();
}

@Retention(RetentionPolicy.RUNTIME)
@interface TestInfo{
    int count() default 1;
    String testedBy();
    String[] testTools() default "JUnit";
    TestType testType() default TestType.FIRST;
    DateTime testDate();
}

@Deprecated
@SuppressWarnings("1111")
@TestInfo(testedBy="aaa", testDate=@DateTime(yymmdd="190228", hhmmss="185959"))
public class AnnotationEx5 {
    public static void main(String[] args) {
        Class<AnnotationEx5> ex5Class = AnnotationEx5.class;

        TestInfo anno = (TestInfo)ex5Class.getAnnotation(TestInfo.class);
        System.out.println("anno.testedBy() = " + anno.testedBy());
        System.out.println("anno.testDate().yymmdd() = " + anno.testDate().yymmdd());
        System.out.println("anno.testDate().hhmmss() = " + anno.testDate().hhmmss());

        for(String str : anno.testTools())
            System.out.println("testTools = " + str);
        System.out.println();

        Annotation[] annoArr = ex5Class.getAnnotations();

        for(Annotation a : annoArr)
            System.out.println(a);
    }
}
