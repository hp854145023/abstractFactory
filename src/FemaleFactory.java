/**
 * Created by 韩鹏 on 2016/12/2.
 */
public class FemaleFactory implements HumanFactory{
    @Override
    public Human createBlackHuman() {
        return new FemaleBlackMan();
    }

    @Override
    public Human createWhiteHuman() {
        return null;
    }

    @Override
    public Human createYellowHuman() {
        return null;
    }
}
