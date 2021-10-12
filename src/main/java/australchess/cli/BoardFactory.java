package australchess.cli;

public interface BoardFactory<K, P, V> {
    Board<K, P, V> createBoard();
}
