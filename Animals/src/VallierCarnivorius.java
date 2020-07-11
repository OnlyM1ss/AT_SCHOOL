import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;


public class VallierCarnivorius extends Carnivorous {
    /*
     * Лев
     * Тигр
     * Акула
     */
    Gson gson = new GsonBuilder()
            .setPrettyPrinting()
            .create();

    private static final Logger logger = LogManager.getLogger();
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
                System.out.println("Всего львов: \n" + (gson.toJson(type)));
            case (2):
                type = "Тигр " + HelpFunc.takeName();
                tigerAll.add(type);
                logger.info(type + "Добавлено");
                System.out.println("Всего Тигров: \n" + (gson.toJson(tigerAll)));
            case (3):
                type = "Акула " + HelpFunc.takeName();
                sharkAll.add(type);
                System.out.println(type + "Добавлено!");
                System.out.println(("Всего акул: \n" + gson.toJson(sharkAll)));
            case (4):

                logger.error("Вальер переполнен! :c");
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
