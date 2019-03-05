package Lab3;

import java.util.ArrayList;

public class ChessDriver {
    public static void main(String[] args) {
        ChessPiece p1 = new Pawn();
        ChessPiece p2 = new Rook();
        ChessPiece p3 = new Knight();
        ChessPiece p4 = new Pawn();
        ChessPiece p5 = new Queen();
        ChessPiece p6 = new Bishop();
        ChessPiece p7 = new King();


        ArrayList<ChessPiece> pieces = new ArrayList<>();
        pieces.add(p1);
        pieces.add(p2);
        pieces.add(p3);
        pieces.add(p4);
        pieces.add(p5);
        pieces.add(p6);
        pieces.add(p7);

        for (ChessPiece piece: pieces){
            piece.move();
            System.out.println(piece.toString());
        }

        System.out.println();
        ((Pawn) p1).promote(new Knight());

    }
}
