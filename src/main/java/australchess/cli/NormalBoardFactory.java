package australchess.cli;

import java.util.HashMap;
import java.util.Map;

public class NormalBoardFactory extends Board<Integer, Integer, PieceType> implements BoardFactory<Integer, Integer, PieceType> {

    public NormalBoardFactory() {
        super(8, 8);
    }

    @Override
    public Board<Integer, Integer, PieceType> createBoard() {
        Board<Integer, Integer, PieceType> board = new Board<>() {};

        Map<Integer, Map<Integer, PieceType>> row = new HashMap<>();
        for (int i = 0; i < getHeight(); i++) {
            Map<Integer, PieceType> column = new HashMap<>();
            for (int j = 0; j < getWidth(); j++) {
                if(i == 1 || i == (getHeight() - 2)){
                    column.put(i, PieceType.PAWN);
                }
                //TOWER
                if((i == 0 || i == (getHeight() - 1)) && (j == 0 || j == getWidth() - 1)) column.put(j, PieceType.TOWER);
                //HORSE
                if((i == 0 || i == (getHeight() - 1)) && (j == 1 || j == getWidth() - 2)) column.put(j, PieceType.HORSE);
                //BISHOP
                if((i == 0 || i == (getHeight() - 1)) && (j == 2 || j == getWidth() - 3)) column.put(j, PieceType.BISHOP);
                //KING
                if((i == 0 || i == (getHeight() - 1)) && (j == 3)) column.put(j, PieceType.KING);
                //QUEEN
                if((i == 0 || i == (getHeight() - 1)) && (j == 4)) column.put(j, PieceType.QUEEN);
                else{ column.put(j, null);}
            }
            row.put(i, column);
        }

        board.setBoardPositions(row);

        return board;
    }
}
