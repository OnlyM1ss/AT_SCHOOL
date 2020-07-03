import java.util.ArrayList;

public class VallierHerbivore extends Herbivore {
    /*
     * Жираф
     * Лемур
     * Утка(обязательно*)*/
    ArrayList<String> giraffeAll = new ArrayList<>();
    ArrayList<String> lemurAll = new ArrayList<>();
    ArrayList<String> duckAll = new ArrayList<>();

    public void giraffe() throws EatException {
        if (!giraffeAll.isEmpty()) {
            System.out.println(move());
        } else {
            addAnimal();
        }
    }

    public void lemur() throws EatException {
        if (!lemurAll.isEmpty()) {
            System.out.println(move());
        } else {
            addAnimal();
        }


    }

    public void duck() throws EatException {
        if (!duckAll.isEmpty()) {
            System.out.println(move());
        } else {
            addAnimal();
        }

    }

    @Override
    protected void addAnimal() {
        String type = "";
        switch (HelpFunc.randomInt(1, 4)) {
            case (1):
                type = "Жираф " + HelpFunc.takeName();
                giraffeAll.add(type);
                System.out.println(type + "Добавлено");
            case (2):
                type = "Лемур " + HelpFunc.takeName();
                lemurAll.add(type);
                System.out.println(type + "Добавлено");

            case (3):
                type = "Утка " + HelpFunc.takeName() + " ";
                duckAll.add(type);
                System.out.println(type + " Добавлено!");
                System.out.println(" Количество уток: " + duckAll.size() + " Количество Лемуров: " + lemurAll.size()
                        + " Количество  Жирафов:" + giraffeAll.size());
            case (4):
                System.out.println("Вальер переполнен! :c");
        }
    }

    public void chouseHerbivore() throws EatException {
        switch (HelpFunc.randomInt(1, 3)) {
            case (1):
                giraffe();
            case (2):
                lemur();
            case (3):
                duck();
        }
    }
}
