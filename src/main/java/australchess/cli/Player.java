package australchess.cli;

public class Player {

    private String playerId;

    private Color color;

    public Player(String playerId, Color color) {
        this.playerId = playerId;
        this.color = color;
    }

    public Player() {
    }

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
