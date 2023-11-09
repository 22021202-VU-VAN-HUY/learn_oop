package week12;

public class Bishop extends Piece {
    public Bishop(int x, int y) {
        super(x, y);
    }

    public Bishop(int x, int y, String color) {
        super(x, y, color);
    }

    @Override
    public String getSymbol() {
        return "B";
    }

    @Override
    public boolean canMove(Board board, int a, int b) {
        int cx = this.getCoordinatesX();
        int cy = this.getCoordinatesY();

        if (Math.abs(a - cx) != Math.abs(b - cy)) {
            return false;
        }

        int deltaX = Integer.compare(a, cx);
        int deltaY = Integer.compare(b, cy);

        for (int i = 1; i < Math.abs(a - cx); i++) {
            if (board.getAt(cx + i * deltaX, cy + i * deltaY) != null) {
                return false;
            }
        }

        if (board.getAt(a, b) != null) {
            return !board.getAt(a, b).getColor().equals(this.getColor());
        }
        return true;
    }

}
