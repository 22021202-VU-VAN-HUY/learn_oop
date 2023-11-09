package week12;

public abstract class Piece {
    private int coordinatesX;
    private int coordinatesY;
    private String color;

    /**
     * constructor 1.
     *
     * @param x .
     * @param y .
     */
    public Piece(int x, int y) {
        this.coordinatesX = x;
        this.coordinatesY = y;
        this.color = "white";
    }

    /**
     * constructor 2 .
     *
     * @param x     .
     * @param y     .
     * @param color .
     */
    public Piece(int x, int y, String color) {
        this.coordinatesX = x;
        this.coordinatesY = y;
        this.color = color;
    }

    public abstract String getSymbol();

    public abstract boolean canMove(Board board, int x, int y);


    public int getCoordinatesX() {
        return coordinatesX;
    }

    public void setCoordinatesX(int coordinatesX) {
        this.coordinatesX = coordinatesX;
    }

    public int getCoordinatesY() {
        return coordinatesY;
    }

    public void setCoordinatesY(int coordinatesY) {
        this.coordinatesY = coordinatesY;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * check Position .
     *
     * @param piece .
     * @return .
     */
    public boolean checkPosition(Piece piece) {
        return (this.coordinatesX == piece.coordinatesX
                && this.coordinatesY == piece.coordinatesY);
    }
}
