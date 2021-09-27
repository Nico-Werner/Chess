package australchess.cli;

public enum Color {
    BLACK,
    WHITE;

    public static String toString(Color color) {
        switch (color) {
            case BLACK:
                return "BLACK";
            case WHITE:
                return "WHITE";
        }
        return "";
    }
}
