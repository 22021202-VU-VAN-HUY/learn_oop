package week12;

import java.util.ArrayList;

public class Game {
    private Board board;
    private ArrayList<Move> moveHistory;

    public Game(Board board) {
        this.board = board;
        moveHistory = new ArrayList<>();
    }

    /**
     * .
     *
     * @param piece .
     * @param x     .
     * @param y     .
     */
    public void movePiece(Piece piece, int x, int y) {
        if (piece.canMove(board, x, y)) {
            Move move = new Move(piece.getCoordinatesX(), piece.getCoordinatesY(), x, y, piece);

            if (board.getAt(x, y) != null) {
                move.setKilledPiece(board.getAt(x, y));
                board.removeAt(x, y);
            }

            moveHistory.add(move);
            piece.setCoordinatesX(x);
            piece.setCoordinatesY(y);
        }
    }


    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public ArrayList<Move> getMoveHistory() {
        return moveHistory;
    }
}
