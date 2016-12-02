/**
 * Created by 韩鹏 on 2016/12/2.
 */
public class TestHuman {
    public static void main(String[] args) {
        HumanFactory humanFactory = new FemaleFactory();
        Human human = humanFactory.createBlackHuman();
        human.getColor();
        human.talk();
        human.getSex();
        System.out.println("haha");
        System.out.println("haha");
        System.out.println("haha");

    }
}
