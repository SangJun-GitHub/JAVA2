package Object_oriented2;

/**
 * Created by bobsang89@gmail.com on 2019-01-05
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class InnerEx3 {
    private int outerIv = 0;
    static int outerCv = 0;

    class InstatnceInner3{
        int iiv = outerIv;          //Private members of external classes are also accessible
        int iiv2 = outerCv;
    }

    static class StaticInner3{
        //A static class can not access instance members of an external class.
//        int siv = outerIv;
        static int scv = outerCv;
    }

    void myMehod(){
        int lv = 0;
        final int LV = 0;

        class LocalInner3{
            int liv = outerIv;
            int liv2 = outerCv;
            //Local variables of external classes are accessible only to variables with final (constant).
            int liv3 = lv;
            int liv4 = LV;
        }
    }
}
