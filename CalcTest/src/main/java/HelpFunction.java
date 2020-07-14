public class HelpFunction {
    /**
     * @param value значение
     * @return пытается преобразовать в int
     */
    static boolean tryParseInt(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     *
     * @param value первое значение
     * @param value2 второе значение
     * @return пытается преобразовать в int
     */
    static boolean tryParseInt(String value,String value2) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
