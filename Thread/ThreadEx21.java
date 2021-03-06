package Thread;

/**
 * Created by bobsang89@gmail.com on 2019-03-06
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
class Account21{
    private int balance = 1000;

    public int getBalance(){
        return balance;
    }

    public void withdraw(int money){
        if(balance >= money){
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){}
            balance -= money;
        }
    }
}
class RunnableEx21 implements Runnable{
    Account21 acc = new Account21();

    public void run(){
        while(acc.getBalance() > 0){
            int money = (int)(Math.random() * 3 + 1) * 100;
            acc.withdraw(money);
            System.out.println("balance:" + acc.getBalance());
        }
    }
}
public class ThreadEx21 {
    public static void main(String[] args) {
        Runnable r = new RunnableEx21();
        new Thread(r).start();
        new Thread(r).start();
    }
}
