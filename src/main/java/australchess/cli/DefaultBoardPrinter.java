package australchess.cli;

import java.util.List;
import java.util.Optional;

// Improve or create a new implementation if you like, this is a naive implementation
public class DefaultBoardPrinter implements BoardPrinter {
    @Override
    public String print(List<BoardPosition> positions) {
        var files = List.of('h', 'g', 'f', 'e', 'd', 'c', 'b', 'a');
        var ranks = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        var builder = new StringBuilder();

        for(var file : files) {
            builder.append(file).append("|");
            for(var rank : ranks) {
                var toPrint = findPiece(file, rank, positions).orElse(' ');
                builder.append(toPrint).append("|");
            }
            builder.append("\n");
        }
        builder.append("  ");
        ranks.forEach(r -> builder.append(r).append(" "));
        builder.append("\n");
        return builder.toString();
    }

    private static Optional<Character> findPiece(Character file, Integer rank, List<BoardPosition> positions) {
        return positions.stream().filter(p -> p.getLetter() == file && p.getNumber().equals(rank)).findFirst().map(BoardPosition::getPieceId);
    }
}
 board somehow.
        var positions = new DefaultSomethingClass().getPiecePositions();
        var boardAsString = boardPrinter.print(positions);
        System.out.println(boardAsString);
    }

    private static void move(ParsedPosition from, ParsedPosition to) {
        // TODO implement!
    }

    private static String playerToMove() {
        return "Someone"; //TODO Implement!
    }

    private static boolean shouldContinue() {
        return true; //TODO Implement!
    }

    private static ParsedPosition askForPosition(String question) {
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

rem the _cmd.exe /c_ return code!
if  not "" == "%GRADLE_EXIT_CONSOLE%" exit 1
exit /b 1

:mainEnd
if "%OS%"=="Windows_NT" endlocal

:omega
 "$darwin" = "false" -a "$nonstop" = "false" ] ; then
    MAX_FD_LIMIT=`ulimit -H -n`
    if [ $? -eq 0 ] ; then
        if [ "$MAX_FD" = "maximum" -o "$MAX_FD" = "max" ] ; then
            MAX_FD="$MAX_FD_LIMIT"
        fi
        ulimit -n $MAX_FD
        if [ $? -ne 0 ] ; then
            warn "Could not set maximum file descriptor limit: $MAX_FD"
        fi
    else
        warn "Could not query maximum file descriptor limit: $MAX_FD_LIMIT"
    fi
fi

# For Darwin, add options to specify how the application appears in the dock
if $darwin; then
    GRADLE_OPTS="$GRADLE_OPTS \"-Xdock:name=$APP_NAME\" \"-Xdock:icon=$APP_HOME/media/gradle.icns\""
fi

# For Cygwin or MSYS, switch paths to Windows format before running java
if [ "$cygwin" = "true" -o "$msys" = "true" ] ; then
    APP_HOME=`cygpath --path --mixed "$APP_HOME"`
    CLASSPATH=`cygpath --path --mixed "$CLASSPATH"`

    JAVACMD=`cygpath --unix "$JAVACMD"`

    # We build the pattern for arguments to be converted via cygpath
    ROOTDIRSRAW=`find -L / -maxdepth 1 -mindepth 1 -type d 2>/dev/null`
    SEP=""
    for dir in $ROOTDIRSRAW ; do
        ROOTDIRS="$ROOTDIRS$SEP$dir"
        SEP="|"
    done
    OURCYGPATTERN="(^($ROOTDIRS))"
    # Add a user-defined pattern to the cygpath arguments
    if [ "$GRADLE_CYGPATTERN" != "" ] ; then
        OURCYGPATTE