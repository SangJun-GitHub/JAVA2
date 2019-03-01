package Thread;

/**
 * Created by bobsang89@gmail.com on 2019-03-01
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
class ThreadEx3_1 extends Thread{
    public void run(){
        throwException();
    }
    public void throwException(){
        try{
            throw new Exception();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
public class ThreadEx3 {
    public static void main(String[] args) {
        ThreadEx3_1 t1 = new ThreadEx3_1();
        t1.run();
    }
}
