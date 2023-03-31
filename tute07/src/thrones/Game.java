package thrones;

public class Game {

    public static void main(String[] args) {
        King king = Factory.createKing(0, 1);
        King king1 = Factory.createKing(0, 1);
        King king2 = Factory.createKing(0, 1);
        King king3 = Factory.createKing(0, 1);
        King king4 = Factory.createKing(0, 1);
        Queen queen = Factory.createQueen(0, 1);
        Queen queen1 = Factory.createQueen(0, 1);
        Queen queen2 = Factory.createQueen(0, 1);
        Queen queen3 = Factory.createQueen(0, 1);

        Factory f = new Factory();
        Character queen7 = f.createQueen123(0, 0);

        // Knight knight = new Knight(0, 2);
        // Dragon dragon = new Dragon(-1, 0);

        // knight.attack(dragon);
    }

}