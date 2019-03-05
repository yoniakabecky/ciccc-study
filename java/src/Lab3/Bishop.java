package Lab3;

/**
 * Each of the six ChessPiece subclasses further overrides the toString() method.
 * Each of the six ChessPiece subclasses also implements the move() method,
 * to System.out.println() how this particular piece moves:
 * Bishop "diagonally"
 */

public class Bishop extends ChessPiece {

    private static int IMPORTANCE = 3;

    public Bishop() {
        super(IMPORTANCE);
    }

    @Override
    public String toString() {
        return "Bishop {value = " + getValue() + " }";
    }

    @Override
    public void move() {
        System.out.println("Bishop moves diagonally");
    }

}
