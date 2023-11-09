package week12;

import java.util.ArrayList;

public class Board {
    public static final int WIDTH = 8;
    public static final int HEIGHT = 8;
    private ArrayList<Piece> pieces;

    /**
     * constructor .
     */
    public Board() {
        pieces = new ArrayList<Piece>();
    }

    /**
     * .
     *
     * @param piece .
     */
    public void addPiece(Piece piece) {
        if (validate(piece.getCoordinatesX(), piece.getCoordinatesY())) {
            for (Piece temp : pieces) {
                if (temp.checkPosition(piece)) {
                    return;
                }
            }
            pieces.add(piece);
        }
    }

    /**
     * check .
     *
     * @param x .
     * @param y .
     * @return .
     */
    public boolean validate(int x, int y) {
        return (x >= 1 && x <= 8 && y >= 1 && y <= 8);
    }

    /**
     * .
     *
     * @param x .
     * @param y .
     */
    public void removeAt(int x, int y) {
        for (Piece temp : pieces) {
            if (temp.getCoordinatesX() == x && temp.getCoordinatesY() == y) {
                pieces.remove(temp);
                return;
            }
        }
    }


    /**
     * .
     *
     * @param x .
     * @param y .
     * @return .
     */
    public Piece getAt(int x, int y) {
        for (Piece temp : pieces) {
            if (temp.getCoordinatesX() == x && temp.getCoordinatesY() == y) {
                return temp;
            }
        }
        return null;
    }

    public ArrayList<Piece> getPieces() {
        return pieces;
    }

    public void setPieces(ArrayList<Piece> pieces) {
        this.pieces = pieces;
    }
}
