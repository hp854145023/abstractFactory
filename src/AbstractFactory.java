/**
 * Created by 韩鹏 on 2016/12/2.
 */
public abstract class AbstractFactory {
    public abstract <T extends Human> T createHuman(Class<T> c);
}
