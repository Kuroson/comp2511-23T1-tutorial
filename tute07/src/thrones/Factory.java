package thrones;

public class Factory {
    public Queen createQueen123(int x, int y) {
        return new Queen(x, y, 0);
    }

    public static Queen createQueen(int x, int y) {
        return new Queen(x, y, 0);
    }

    public static King createKing(int x, int y) {
        return new King(x, y, 0);
    }
}
