import java.util.ArrayList;
import java.util.Random;


public  class HelpFunc {
    /**
     * @param a - начальное значение
     * @param b - конечное значение
     * @return случайное число
     */
    static public int randomInt(int a,int b)
    {
        return (a + (int)(Math.random() * b));
    }

    /**
     *
     * @return Возвращает случайное имя
     */
    static public String takeName(){
        ArrayList<String> name = new ArrayList<String>();
        name.add("Роман");
        name.add("Максим");
        name.add("Виталя");
        name.add("Оксана");
        name.add("Виталина");
        name.add("Елена");
        name.add("Стэнли");
        name.add("Натан");
        name.add("Пол");
        name.add("Маверик");
        return name.get(randomInt(0,9));
    }
}
