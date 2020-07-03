abstract public class Animals {

    protected String eat() throws EatException {
        return "Питомец покушал";
    }

    protected String caress() {
        return "Голос";
    }

    protected String look() {
        return "Питомец стесняется когда на него смотрят";
    }

    protected String take() {
        return "Питомцу нравится на руках ";
    }

    protected void addAnimal() {
        System.out.println("Животное добавлено");
    }
}
