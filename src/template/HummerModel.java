package template;

/**
 * Created by 韩鹏 on 2016/12/2.
 */
public abstract class HummerModel {
    public abstract void start();
    public abstract void stop();
    public abstract void alarm();
    public  void run(){
        this.start();
        this.alarm();
        this.stop();
    }
}
