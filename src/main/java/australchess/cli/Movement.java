package australchess.cli;

public class Movement {

    private int startPosition;
    private int nextPosition;

    public Movement(int startPosition, int nextPosition) {
        this.startPosition = startPosition;
        this.nextPosition = nextPosition;
    }

    public Movement() {
    }

    public int getStartPosition() {
        return startPosition;
    }

    public void setStartPosition(int startPosition) {
        this.startPosition = startPosition;
    }

    public int getNextPosition() {
        return nextPosition;
    }

    public void setNextPosition(int nextPosition) {
        this.nextPosition = nextPosition;
    }
}
