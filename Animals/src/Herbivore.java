import java.util.ArrayList;

abstract class Herbivore extends Animals {
    /*
     *Травоядных можно гладить
     * Травоядных можно взять на руки
     */
    int satiety = 0;
    int happy = 0;

    @Override
    protected String eat() throws EatException {
        int currentEat = 0;
        ArrayList<eFood> food = new ArrayList<>();
        food.add(eFood.Grass);
        food.add(eFood.MomsCooking);
        food.add(eFood.Chicken);
        food.add(eFood.HotDog);
        food.add(eFood.Pork);

        EatForType eat = new EatForType();
        int a = HelpFunc.randomInt(0, 4);
        eat.eatForHerbivore(food.get(a));
            currentEat = HelpFunc.randomInt(1, 5);
            satiety += currentEat;
            return "стал сытнее на : " + currentEat + " Съев: " + food.get(a);
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

    public String move() throws EatException {
        switch (HelpFunc.randomInt(1, 5)) {
            case (1):
                return eat();
            case (2):
                return caress();
            case (3):
                return look();

            case (4):
                return take();
            case (5):
                addAnimal();
                return "Добавлено";
        }
        return null;
    }
}

class EatException extends Exception {
    /**
     * не тот тип еды
     *
     * @param message - message of error
     */

    public EatException(String message) {
        super(message);
    }
}
