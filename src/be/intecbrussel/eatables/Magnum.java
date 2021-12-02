package be.intecbrussel.eatables;

public class Magnum implements Eatable {

    private MagnumType magnumType;
    //private MagnumType magnumType=MagnumType.APINENUTS;


    public Magnum() {
    }

    public Magnum(MagnumType magnumType) {
        this.magnumType = magnumType;
    }

    @Override
    public void eat() {

        System.out.println("I'm eating a " + getMagnumType().name() + " magnum");


    }


    public MagnumType getMagnumType() {
        return magnumType;
    }

    public enum MagnumType {
        MILKCHOCOLATE(1.7),
        WHITECHOCOLATE(2.8),
        BLACKCHOCOLATE(1.7),
        APINENUTS(1.5),
        ROMANTICSTRAWBERRIES(2.6);
        private final double procent;


        MagnumType(double procent) {
            this.procent = procent;
        }

        public double getProcent() {
            return procent;
        }

        @Override
        public String toString() {
            return name();
        }
    }

}
