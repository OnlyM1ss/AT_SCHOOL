import java.util.ArrayList;

public class VallierCarnivorius extends Carnivorous {
    /*
     *Лев
     * Тигр
     * Акула
     */
    ArrayList<String> lionAll = new ArrayList<>();
    ArrayList<String> tigerAll = new ArrayList<>();
    ArrayList<String> sharkAll = new ArrayList<>();

    public void lion() {
        if (!lionAll.isEmpty())
            System.out.println(move());
        else addAnimal();
    }

    public void tiger() {
        if (!tigerAll.isEmpty()) System.out.println(move());
        else addAnimal();
    }

    public void shark() {
        if (!sharkAll.isEmpty()) System.out.println(move());
        else addAnimal();
    }

    @Override
    protected void addAnimal() {
        String type = "";
        switch (HelpFunc.randomInt(1, 4)) {
            case (1):
                type = "Лев " + HelpFunc.takeName();
                lionAll.add(type);
                System.out.println(type + "Добавлено");
            case (2):
                type = "Тигр " + HelpFunc.takeName();
                tigerAll.add(type);
                System.out.println(type + "Добавлено");

            case (3):
                type = "Акула " + HelpFunc.takeName();
                sharkAll.add(type);
                System.out.println(type + "Добавлено!");
                System.out.println(" Количество Львов: " + lionAll.size() + " Количество Тигров: " + tigerAll.size()
                        + " Количество  Акул:" + sharkAll.size());
            case (4):
                System.out.println("Вальер переполнен! :c");
        }
    }

    public void chouseCarnivorous() {
        switch (HelpFunc.randomInt(1, 3)) {
            case (1):
                lion();
            case (2):
                tiger();
            case (3):
                shark();
        }
    }
}
