package Object_oriented2;

/**
 * Created by bobsang89@gmail.com on 2018-12-25
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
class VCR {
    boolean power;
    int counter = 0;
    void power() { power = ! power; }
    void play() { /*omission*/}
    void stop() { /*omission*/}
    void rew() { /*omission*/}
    void ff() { /*omission*/}
}

public class TVCR extends Tv{
    VCR vcr = new VCR(); //It uses by including VCR class.
    int counter = vcr.counter;

    void play(){
        vcr.play();
    }
    void stop(){
        vcr.stop();
    }
    void rew(){
        vcr.rew();
    }
    void ff(){
        vcr.ff();
    }

    //Externally, It looks like using an instance of TVCR class.
    //Internally, It uses an instance of VCR class.
}
