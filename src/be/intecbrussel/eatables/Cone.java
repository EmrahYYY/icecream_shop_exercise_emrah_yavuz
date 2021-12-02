package be.intecbrussel.eatables;

public class Cone implements Eatable {
    private Flavor[] balls;


    public Cone() {
    }

    public Cone(Flavor[] balls) {
        this.balls = balls;
    }


    public Flavor[] getBalls() {
        return balls;
    }

    @Override
    public void eat() {


        for (Flavor myballs : balls) {

            System.out.println("I'm eating a " + myballs.name());
        }


    }

    public enum Flavor {

        STRAWBERRY,
        BANANA,
        CHOCOLATE,
        VANILLA,
        LEMON,
        STRACIATELLA,
        MOKKA,
        PISTACHE;

    }

}
