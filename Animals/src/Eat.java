class EatForType  {

    public boolean eatForHerbivore(eFood food) throws EatException {

        try {
            if ((food.equals(eFood.Grass) | food.equals(eFood.MomsCooking))) {
                return true;
            } else throw new EatException(food.name());
        } catch (EatException e) {
            e.printStackTrace();
        }
        return false;
    }
}
