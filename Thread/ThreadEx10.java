package Thread;

/**
 * Created by bobsang89@gmail.com on 2019-03-04
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class ThreadEx10 implements Runnable {
    static boolean autoSave = false;

    public static void main(String[] args) {
        Thread t = new Thread(new ThreadEx10());
        t.setDaemon(true);
        t.start();

        for(int i = 1; i <= 10; i++){
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){

            }
            System.out.println(i);
            if(i == 5)
                autoSave = true;
        }
        System.out.println("Exit the program.");
    }

    public void run(){
        while(true){
            try{
                Thread.sleep(3 * 1000);
            }catch(InterruptedException e){

            }
            if(autoSave){
                autoSave();
            }
        }
    }

    public void autoSave(){
        System.out.println("The work file was saved automatically.");
    }
}
