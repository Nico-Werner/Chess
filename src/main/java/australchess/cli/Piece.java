package australchess.cli;

import java.util.List;

public class Piece implements Position{

    private boolean active;

    private Color color;

    private PieceType pieceType;

    private int movementX;

    private int movementY;

    private boolean movesOneTime;

    public Piece() {
    }

    public Piece(boolean active, Color color, PieceType pieceType, int movementX, int movementY, boolean movesOneTime) {
        this.active = active;
        this.color = color;
        this.pieceType = pieceType;
        this.movementX = movementX;
        this.movementY = movementY;
        this.movesOneTime = movesOneTime;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Color getColor() {
        return color;
    }

    public PieceType getPieceType() {
        return pieceType;
    }

    public int getMovementX() {
        return movementX;
    }

    public int getMovementY() {
        return movementY;
    }

    public boolean isMovesOneTime() {
        return movesOneTime;
    }

    @Override
    public List<Space> getPositions() {
        return null;
    }

    @Override
    public boolean move(Space space) {
        return false;
    }

    @Override
    public Space getPosition() {
        return null;
    }

    @Override
    public void setPosition(Space space) {

    }
}
