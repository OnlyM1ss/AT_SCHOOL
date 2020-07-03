public class LocalExceptions {
    class EatException extends Exception {
        protected EatException(String Food) {
            super("Не та еда");
        }

        protected EatException() {
            super("Необработанная ошибка ");
        }
    }
}
