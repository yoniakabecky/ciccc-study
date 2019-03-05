package Lab3;

/**
 * Each of the six ChessPiece subclasses further overrides the toString() method.
 * Each of the six ChessPiece subclasses also implements the move() method,
 * to System.out.println() how this particular piece moves:
 * Knight "like an L"
 */

public class Knight extends ChessPiece {

    private static int IMPORTANCE = 2;

    public Knight() {
        super(IMPORTANCE);
    }

    @Override
    public String toString() {
        return "Knight {value = " + getValue() + "}";
    }

    @Override
    public void move() {
        System.out.println("Knight moves like an L");
    }

}
