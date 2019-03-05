package Lab3;

/**
 * Each of the six ChessPiece subclasses further overrides the toString() method.
 * Each of the six ChessPiece subclasses also implements the move() method,
 * to System.out.println() how this particular piece moves:
 * Rook "horizontally or vertically"
 */

public class Rook extends ChessPiece {

    private static int IMPORTANCE = 5;

    public Rook() {
        super(IMPORTANCE);
    }

    @Override
    public String toString() {
        return "Rook {value = " + getValue() + "}";
    }

    @Override
    public void move() {
        System.out.println("Rook moves horizontally or vertically");
    }


}
