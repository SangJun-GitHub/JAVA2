package Thread;

import java.util.Iterator;
import java.util.Map;

/**
 * Created by bobsang89@gmail.com on 2019-03-04
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
class ThreadEx11_1 extends Thread{
    ThreadEx11_1(String name){
        super(name);
    }
    public void run(){
        try{
            sleep(5 * 1000);
        }catch(InterruptedException e){}
    }
}
class ThreadEx11_2 extends Thread{
    ThreadEx11_2(String name){
        super(name);
    }
    public void run(){
        Map map = getAllStackTraces();
        Iterator iterator = map.keySet().iterator();

        int x = 0;
        while(iterator.hasNext()){
            Object object = iterator.next();
            Thread t = (Thread)object;
            StackTraceElement[] stackTraceElements = (StackTraceElement[])(map.get(object));

            System.out.println("["+ ++x + "] name : " + t.getName() +
                    ", group : " + t.getThreadGroup().getName() +
                    ", daemon : " + t.isDaemon());
            for(int i = 0; i < stackTraceElements.length; i++){
                System.out.println(stackTraceElements[i]);
            }
            System.out.println();
        }
    }
}
public class ThreadEx11 {
    public static void main(String[] args) throws Exception {
        ThreadEx11_1 t1 = new ThreadEx11_1("Thread1");
        ThreadEx11_2 t2 = new ThreadEx11_2("Thread2");
        t1.start();
        t2.start();
    }
}
