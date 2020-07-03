public class Realize {
    public void interaction() throws EatException {
        VallierCarnivorius vallierCarnivorius = new VallierCarnivorius();
        VallierHerbivore vallierHerbivore = new VallierHerbivore();
        for (int i = 0; i < 50; i++) {
            int chuese = HelpFunc.randomInt(1, 2);
            if (chuese == 1) {
                vallierCarnivorius.chouseCarnivorous();
            } else if (chuese == 2) {
                vallierHerbivore.chouseHerbivore();
            }
        }

    }
}