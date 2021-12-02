package be.intecbrussel.sellers;

public class NoMoreIceCreamException extends Exception {

    public NoMoreIceCreamException(String message) {
        super(message);

        System.out.println("sorry, out of stock, message of class NoMoreIceCreamException ");

    }
}
