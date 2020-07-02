import java.util.ArrayList;

abstract class Herbivore extends Animals {
    /*
     *Травоядных можно гладить
     * Травоядных можно взять на руки
     */
    int satiety = 0;
    int happy = 0;

    @Override
    protected String eat() {
        int currentEat = 0;
        ArrayList<Eat> food = new ArrayList<>();
        food.add(Eat.Grass);
        food.add(Eat.MomsCooking);
        food.add(Eat.Chicken);
        food.add(Eat.HotDog);
        food.add(Eat.Pork);

        int a = HelpFunc.randomInt(0,4);

        if (a == 0 | a == 1) {
            currentEat = HelpFunc.randomInt(1, 5);
            satiety += currentEat;
            return "стал сытнее на : " + currentEat + " Съев: " + food.get(a);
        } else {
            return "Травоядные не едят: " + food.get(a);
        }

    }

    @Override
    protected String caress() {
        int currentHappy = 0;
        currentHappy = HelpFunc.randomInt(1, 5);
        happy += currentHappy;
        return "стал выселее от поглаживаний на: " + currentHappy;
    }

    @Override
    protected String look() {
        int currentHappy = 0;
        currentHappy = HelpFunc.randomInt(1, 5);
        happy += currentHappy;
        return "стал грустнее что на него смотрят на: " + currentHappy;
    }

    @Override
    protected String take() {
        int currentHappy = 0;
        currentHappy = HelpFunc.randomInt(1, 5);
        happy += currentHappy;
        return "стал выселее что его взяли на руки на: " + currentHappy;

    }
    public String move() {
        switch (HelpFunc.randomInt(1, 5)) {
            case (1):
                return eat();
            case (2):
                return caress();
            case (3):
                return look();

            case (4):
                return take();
            case(5):
                addAnimal();
                return "Добавлено";
        }
        return null;
    }

}
