package Lab3;

/**
 * Each of the six ChessPiece subclasses further overrides the toString() method.
 * Each of the six ChessPiece subclasses also implements the move() method,
 * to System.out.println() how this particular piece moves:
 * Queen "like a bishop or a rook"
 */

public class Queen extends ChessPiece {

    private static int IMPORTANCE = 9;

    public Queen() {
        super(IMPORTANCE);
    }

    @Override
    public String toString() {
        return "Queen {value = " + getValue() + "}";
    }

    @Override
    public void move() {
        System.out.println("Queen moves like a bishop or a rook");
    }


}
