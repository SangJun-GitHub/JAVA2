package Exception_handling;

/**
 * Created by bobsang89@gmail.com on 2019-01-13
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
class CloseableResource implements AutoCloseable{
    public void exceptionWork(boolean exception)throws WorkException{
        System.out.println("exceptionWork("+exception+") was called");
        if(exception)
            throw new WorkException("WorkException occur!!");
    }
    public void close() throws CloseException{
        System.out.println("close() was called");
        throw new CloseException("CloseException occur!!");
    }
}
class WorkException extends Exception{
    WorkException(String msg){super(msg);}
}
class CloseException extends Exception{
    CloseException(String msg){super(msg);}
}
public class TryWithResourceEx {
    public static void main(String[] args) {
        try(CloseableResource cr = new CloseableResource()){
            cr.exceptionWork(false);
        }catch (WorkException e){
            e.printStackTrace();
        }catch (CloseException e){
            e.printStackTrace();
        }
        System.out.println();

        try(CloseableResource cr = new CloseableResource()){
            cr.exceptionWork(true);     //exception occur, because two exceptions cannot occur
        }catch (WorkException e){
            e.printStackTrace();
        }catch (CloseException e){
            e.printStackTrace();
        }
    }
}
