package Thread;

/**
 * Created by bobsang89@gmail.com on 2019-03-07
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
class Account22{
    private int balance = 1000;

    public int getBalance(){
        return balance;
    }

    public synchronized void withdraw(int money){
        if(balance >= money){
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){}
            balance -= money;
        }
    }
}
class RunnableEx22 implements Runnable{
    Account22 account = new Account22();

    public void run(){
        while(account.getBalance() > 0){
            int money = (int)(Math.random() * 3 + 1) * 100;
            account.withdraw(money);
            System.out.println("Balance : " + account.getBalance());
        }
    }
}
public class ThreadEx22 {
    public static void main(String[] args) {
        Runnable r = new RunnableEx22();
        new Thread(r).start();
        new Thread(r).start();
    }
}
