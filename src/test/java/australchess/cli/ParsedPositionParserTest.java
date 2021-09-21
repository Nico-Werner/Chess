package australchess.cli;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.*;

public class ParsedPositionParserTest {

    @Test
    public void can_parse_3_e() {
        var toTest = "(3,e)";
        Optional<ParsedPosition> position = ParsedPositionParser.parse(toTest);
        assertThat(position).isPresent();
        assertThat(position).map(ParsedPosition::getNumber).hasValue(3);
        assertThat(position).map(ParsedPosition::getLetter).hasValue('e');
    }

    @Test
    public void cannot_parse_e_3() {
        var toTest = "(e,3)";
        Optional<ParsedPosition> position = ParsedPositionParser.parse(toTest);
        assertThat(position).isNotPresent();
    }

    @Test
    public void cannot_parse_something() {
        var toTest = "something";
        Optional<ParsedPosition> position = ParsedPositionParser.parse(toTest);
        assertThat(position).isNotPresent();
    }
}
 'b'),
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
n) {
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