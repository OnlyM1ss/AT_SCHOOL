/**
 * Калькулятор для целых чисел
 */
public class Calculator {
    /**
     * @param a - Первый множитель
     * @param b - Второй множитель
     * @return a*b
     */
    public int multiply(String a, String b) throws Exception {
        if(HelpFunction.tryParseInt(a,b))   {
            return Integer.parseInt(a)*Integer.parseInt(b);
        }
        throw new Exception("Невозможно преобразовать в число");
    }

    /**
     * @param a - Первое число
     * @param b - Второе число
     * @return
     */
    public int sum(String a, String b) throws Exception {
        if(HelpFunction.tryParseInt(a,b))   {
            return Integer.parseInt(a)+Integer.parseInt(b);
        }
        throw new Exception("Невозможно преобразовать в число");
    }

    /**
     * @param a - Из чего вычитают
     * @param b - Что вычитают
     * @return разницу между a и b
     */
    public int difference(String a, String b) throws Exception {
        if(HelpFunction.tryParseInt(a,b))   {
            return Integer.parseInt(a)-Integer.parseInt(b);
        }
        throw new Exception("Невозможно преобразовать в число");
    }

    /**
     * @param a - Что делят
     * @param b - На что делят
     * @return a/b
     */
    public int divvy(String a, String b) throws Exception {
        if(HelpFunction.tryParseInt(a,b))   {
            return Integer.parseInt(a)/Integer.parseInt(b);
        }
        throw new Exception("Невозможно преобразовать в число");
    }
}
