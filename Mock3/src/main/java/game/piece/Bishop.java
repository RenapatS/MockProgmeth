package game.piece;

import game.board.Board;
import game.position.Position;

public class Bishop extends Piece {
    public Bishop(boolean isWhite, Position pos, Board board){
        super(isWhite,pos,board);
    }
    @Override
    public Object deepCopy(){
        Bishop nw = new Bishop(this.white,this.position,this.board);
        nw.setMoved(this.moved);
        return nw;
    }
}
