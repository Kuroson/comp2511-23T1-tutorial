package thrones;

public class CharacterFactory {

    public static King createKing(int x, int y) {
        return new King(x, y, 0);
    }

    public static King createKing3D(int x, int y, int z) {
        return new King(x, y, z);
    }

    // public static Character create(String type) {
    //     if (type.equals("King")) {
    //         return new King(0, 0, 0);
    //     }
    // }
}
