package Input_Output;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.StringWriter;

/**
 * Created by bobsang89@gmail.com on 2019-03-18
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
class InputThread extends Thread{
    PipedReader input = new PipedReader();
    StringWriter stringWriter = new StringWriter();

    InputThread(String name){
        super(name);
    }

    public void run(){
        try{
            int data = 0;
            while((data = input.read()) != -1){
                stringWriter.write(data);
            }
            System.out.println(getName() + " received : " + stringWriter.toString());
        }catch (IOException e){}
    }

    public PipedReader getInput(){
        return input;
    }

    public void connect(PipedWriter output){
        try{
            input.connect(output);
        }catch(IOException e){}
    }
}
class OutputThread extends Thread{
    PipedWriter output = new PipedWriter();

    OutputThread(String name){
        super(name);
    }

    public void run(){
        try{
            String msg = "Hello";
            System.out.println(getName() + " sent : " + msg);
            output.write(msg);
            output.close();
        }catch(IOException e){}
    }

    public PipedWriter getOutput(){
        return output;
    }

    public void connect(PipedReader input){
        try{
            output.connect(input);
        }catch(IOException e){}
    }
}
public class PipedReaderWriter {
    public static void main(String[] args) {
        InputThread inputThread = new InputThread("InputThread");
        OutputThread outputThread = new OutputThread("OutputThread");

        inputThread.connect(outputThread.getOutput());

        inputThread.start();
        outputThread.start();
    }
}
