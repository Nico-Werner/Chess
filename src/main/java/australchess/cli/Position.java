package australchess.cli;

import java.util.List;

public interface Position {
    List<Space> getPositions();
    boolean move(Space space);
    Space getPosition();
    void setPosition(Space space);
}
