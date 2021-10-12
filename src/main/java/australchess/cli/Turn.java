package australchess.cli;

public class Turn {

    private Player playersTurn;

    private boolean hasMove;

    public Turn(Player player) {
        this.playersTurn = player;
        this.hasMove = false;
    }

    public Player getPlayersTurn() {
        return playersTurn;
    }

    public void setPlayersTurn(Player playersTurn) {
        this.playersTurn = playersTurn;
    }

    public boolean isHasMove() {
        return hasMove;
    }

    public void setHasMove(boolean hasMove) {
        this.hasMove = hasMove;
    }
}
