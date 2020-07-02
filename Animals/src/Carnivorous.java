abstract public class Carnivorous extends Animals {
    /*
     *Хищников нельзя гладить
     * Хищников нельзя взять на руки
     */
    int satiety = 0;
    int happy = 0;

    @Override
    protected String eat() {
        int currentEat = 0;
        currentEat = HelpFunc.randomInt(1, 5);
        satiety += currentEat;
        return "стал сытнее: " + currentEat;

    }

    @Override
    protected String caress() {
        int currentHappy = 0;
        currentHappy = HelpFunc.randomInt(1, 5);
        happy += currentHappy;
        return "псс, аккуратнее, он же хищник!: ";
    }

    @Override
    protected String look() {
        int currentHappy = 0;
        currentHappy = HelpFunc.randomInt(1, 5);
        happy -= currentHappy;
        return "стал грустнее что не может откусить палец на: " + currentHappy;
    }

    @Override
    protected String take() {
        int currentHappy = 0;
        currentHappy = HelpFunc.randomInt(1, 5);
        happy += currentHappy;
        return "псс, аккуратнее, он же хищник!: " + currentHappy;
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
