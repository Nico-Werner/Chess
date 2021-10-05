package australchess.cli;

public class Player {

    private int playerId;

    private Color color;

    public Player(int playerId, Color color) {
        this.playerId = playerId;
        this.color = color;
    }

    public Player() {
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
