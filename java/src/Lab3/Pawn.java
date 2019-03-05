package Lab3;

import java.util.Objects;

/**
 * Each of the six ChessPiece subclasses further overrides the toString() method.
 * Each of the six ChessPiece subclasses also implements the move() method,
 * to System.out.println() how this particular piece moves:
 * Pawn "forward 1"
 */

public class Pawn extends ChessPiece {

    private static int IMPORTANCE = 1;

    /**
     * The Pawn class must contain two new instance variables:
     */
    private boolean hasBeenPromoted;
    private ChessPiece newPiece;


    public Pawn() {
        super(IMPORTANCE);
        this.hasBeenPromoted = false;
    }

    @Override
    public String toString() {
        return "Pawn {value = " + getValue() + "}";
    }

    @Override
    public void move() {
        System.out.println("Pawn moves forward 1");
    }


    /**
     * In the game of chess, when a Pawn reaches the far side of the board,
     * it is exchanged for another ChessPiece; for example, a Pawn can
     * “become” a Rook, or a Queen, etc.... It cannot become a King or Pawn though.
     * @param newPiece
     */
    public void promote(ChessPiece newPiece) {
        if (hasBeenPromoted) {
            System.out.println("Already been promoted.");
        }
        if (newPiece.getValue() == 1000 || newPiece.getValue() == 1){
            System.out.println("Invalid promotion. You cannot promote a King or a Pawn.");
            return;
        }
        this.newPiece = newPiece;
        this.hasBeenPromoted = true;
        setValue(newPiece.getValue());
        System.out.println("Has been promoted to " + newPiece);
    }

    /**
     * Override the equals() method of the Pawn class so that Pawns are NOT equal
     * if one has been promoted and another has not. Pawns are also NOT equal
     * if they have been promoted to different ChessPiece types.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pawn pawn = (Pawn) o;
        return hasBeenPromoted == pawn.hasBeenPromoted &&
                Objects.equals(newPiece, pawn.newPiece);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasBeenPromoted, newPiece);
    }
}
