import java.util.ArrayList;

abstract public class Eat {
    public static String typeOfEat() {

        ArrayList<String> eatForAll = new ArrayList<String>();
        eatForAll.add("Трава");
        eatForAll.add("Свинина");
        eatForAll.add("стрепня Мамы");
        eatForAll.add("сосиски за 24 рубля из пятерочки");
        eatForAll.add("Курица");
        return eatForAll.get(HelpFunc.randomInt(0, 4));
    }
}