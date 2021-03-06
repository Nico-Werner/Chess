package australchess.cli;

import java.util.List;

// TODO: Only used for demo purposes, delete after implementing the interface with something suitable
public class DefaultSomethingClass implements SomethingClass {

    @Override
    public List<BoardPosition> getPiecePositions() {
        return List.of(
            new BoardPosition('R', 1, 'a'),
            new BoardPosition('N', 2, 'a'),
            new BoardPosition('B', 3, 'a'),
            new BoardPosition('K', 4, 'a'),
            new BoardPosition('Q', 5, 'a'),
            new BoardPosition('B', 6, 'a'),
            new BoardPosition('N', 7, 'a'),
            new BoardPosition('R', 8, 'a'),

            new BoardPosition('P', 1, 'b'),
            new BoardPosition('P', 2, 'b'),
            new BoardPosition('P', 3, 'b'),
            new BoardPosition('P', 4, 'b'),
            new BoardPosition('P', 5, 'b'),
            new BoardPosition('P', 6, 'b'),
            new BoardPosition('P', 7, 'b'),
            new BoardPosition('P', 8, 'b'),

            new BoardPosition('P', 1, 'g'),
            new BoardPosition('P', 2, 'g'),
            new BoardPosition('P', 3, 'g'),
            new BoardPosition('P', 4, 'g'),
            new BoardPosition('P', 5, 'g'),
            new BoardPosition('P', 6, 'g'),
            new BoardPosition('P', 7, 'g'),
            new BoardPosition('P', 8, 'g'),

            new BoardPosition('R', 1, 'h'),
            new BoardPosition('N', 2, 'h'),
            new BoardPosition('B', 3, 'h'),
            new BoardPosition('K', 4, 'h'),
            new BoardPosition('Q', 5, 'h'),
            new BoardPosition('B', 6, 'h'),
            new BoardPosition('N', 7, 'h'),
            new BoardPosition('R', 8, 'h')
        );
    }
}
/* {
        System.out.println(question);
        System.out.print("Enter in format -> (number,letter): ");
        var scanner = new Scanner(System.in);
        var positionAsString = scanner.nextLine();
        return ParsedPositionParser.parse(positionAsString)
                .orElseGet(() -> askForPosition("The position " + positionAsString + " is invalid. Please enter a new one"));
    }

    private static void printCurrentPlayerTurn() {
        System.out.println("It's " + playerToMove() + " turn!");
    }

    private static String askForString(String question) {
        System.out.println(question);
        var scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static void printHeader() throws IOException {
        String header = FigletFont.convertOneLine("AustralChess");
        System.out.println(header);
    }
}

 */