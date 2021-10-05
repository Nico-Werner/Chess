package australchess.cli;

import java.util.List;

public interface CheckMateValidator {
    boolean hasCheckMate(List<Piece> pieces);
}
