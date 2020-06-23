public class RelizeKotik extends Kotikmove {


    public void liveAnotherDay(int move) {
        for (int i = 0; i < 24; i++) {
            switch (RandomNext(1,6)) {
                case (1):
                    if (!play()) {
                        System.out.println("Котика нужно покормить");
                        eat();
                    }
                    else play();
                case (2):
                    if (!sleep()) {
                        System.out.println("Котика нужно покормить");
                        eat();
                    }
                    else sleep();
                case (3):
                    if (!chaseMouse()) {
                        System.out.println("Котика нужно покормить");
                        eat();
                    }
                    else chaseMouse();
                case (4):
                    eat();
                case (5):
                    if (!getOwnerHappy()) {
                        System.out.println("Котика нужно покормить");
                        eat();
                    }
                    else getOwnerHappy();
                case (6):
                    if (!destroyRoom()) {
                        System.out.println("Котика нужно покормить");
                        eat();
                    }
                    else destroyRoom();

            }
        }
        System.out.println("День котика прошел очень продуктивно");
    }
}
