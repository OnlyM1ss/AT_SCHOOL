import java.util.List;
import java.util.Random;

abstract public class Kotikmove {
    int Hungry = 0;

    protected boolean play() {
        System.out.println("Котик поиграл");
        Hungry--;
        return Hungry >= 0 ? true : false;
    }

    protected boolean sleep() {
        System.out.println("Котик наелся и спит");
        Hungry--;
        return Hungry >= 0 ? true : false;
    }

    protected boolean chaseMouse() {
        System.out.println("Кот ловит мышь");
        Hungry--;
        return Hungry >= 0 ? true : false;
    }

    protected int eat(int n) {
        /*
        * условных единиц еды
         */
        n = RandomNext(1, 4);
        return n;
    }

    protected String eat(int n, String b) {
        String[] eat = new String[3];
        eat[0] = "Вискас";
        eat[1] = "Курица";
        eat[2] = "Рыбка";
        int numberOfEat = RandomNext(0, 3);
        Hungry += n;
        return ("Котик поел " + eat[numberOfEat] + " и наел он на: " + eat(n));
    }

    protected void eat() {
        int n = 0;
        String b = "";
        System.out.println(eat(n,b));
    }

    protected boolean getOwnerHappy() {
        System.out.println("Котик сделал хозяйна счастливым");
        Hungry--;
        return Hungry >= 0 ? true : false;
    }

    protected boolean destroyRoom() {
        System.out.println("Котик разрушил комнату!");
        Hungry--;
        return Hungry >= 0 ? true : false;
    }

    public int RandomNext(int a, int b) {
        return a + (int) (Math.random() * b);
    }
}

