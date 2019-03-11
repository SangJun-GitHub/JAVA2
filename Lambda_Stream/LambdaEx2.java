package Lambda_Stream;

/**
 * Created by bobsang89@gmail.com on 2019-03-10
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
@FunctionalInterface
interface MyFuntion{
    void myMethod();
}
public class LambdaEx2 {
    public static void main(String[] args) {
        MyFunction f = () -> {};
        Object object = (MyFunction)(()->{});
        String str = ((Object)(MyFunction)(()->{})).toString();

        System.out.println(f);
        System.out.println(object);
        System.out.println(str);

//        System.out.println(()->{});                               Error. Lambda can not convert to Object type
        System.out.println((MyFunction)(()->{}));
//        System.out.println((MyFunction)(()->{}).toString());      Error.
        System.out.println(((Object)(MyFunction)(()->{})).toString());
    }
}
