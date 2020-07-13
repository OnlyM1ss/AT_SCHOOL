/**
 * Калькулятор для целых чисел
 */
public class Calculator {
    /**
     * @param a - Первый множитель
     * @param b - Второй множитель
     * @return a*b
     */
    public int multyply(int a, int b) {
        return a * b;
    }

    /**
     * @param a - Первое число
     * @param b - Второе число
     * @return
     */
    public int sum(int a, int b) {
        return a + b;
    }

    /**
     *
     * @param a - Из чего вычитают
     * @param b - Что вычитают
     * @return разницу между a и b
     */
    public int difference(int a, int b) {
        return a - b;
    }

    /**
     *
     * @param a - Что делят
     * @param b - На что делят
     * @return a/b
     */
    public int divvy(int a, int b) {
        return a / b;
    }
}
