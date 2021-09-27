package australchess.cli;

public enum PieceType {
    PAWN,
    BISHOP,
    HORSE,
    TOWER,
    QUEEN,
    KING;

    public static String toString(PieceType pieceType) {
        switch (pieceType) {
            case PAWN:
                return "PAWN";
            case BISHOP:
                return "BISHOP";
            case HORSE:
                return "KNIGHT";
            case TOWER:
                return "TOWER";
            case QUEEN:
                return "QUEEN";
            case KING:
                return "KING";
        }
        return "";
    }
}
