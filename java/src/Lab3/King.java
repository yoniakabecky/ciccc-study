package Lab3;

/**
 * Each of the six ChessPiece subclasses further overrides the toString() method.
 * Each of the six ChessPiece subclasses also implements the move() method,
 * to System.out.println() how this particular piece moves:
 * King "one square"
 */

public class King extends ChessPiece {

    private static int IMPORTANCE = 1000;

    public King() {
        super(IMPORTANCE);
    }

    @Override
    public String toString() {
        return "King {value = " + getValue() + "}";
    }

    @Override
    public void move() {
        System.out.println("King moves one square");
    }

}
