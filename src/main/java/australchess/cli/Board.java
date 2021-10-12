package australchess.cli;

import java.util.HashMap;
import java.util.Map;

public abstract class Board<K, P, V> {
    private Map<K, Map<P, V>> boardPositions;
    private int height;
    private int width;

    public Board(int height, int width){
        this.height = height;
        this.width = width;
    }

    public Board() {
    }

    public void setBoardPositions(Map<K, Map<P, V>> boardPositions) {
        this.boardPositions = boardPositions;
    }

    public Map<K, Map<P, V>> getBoardPositions() {
        return boardPositions;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
