package template;

/**
 * Created by 韩鹏 on 2016/12/2.
 */
public class Hummer1 extends HummerModel {
    @Override
    public void start() {
        System.out.println("start 1");
    }

    @Override
    public void stop() {
        System.out.println("1 stop");

    }

    @Override
    public void alarm() {
        System.out.println("1 alarm");

    }
}
