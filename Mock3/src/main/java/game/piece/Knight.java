package game.piece;

import game.board.Board;
import game.position.Position;

public class Knight extends Piece {
    public Knight(boolean isWhite, Position pos, Board board){
        super(isWhite,pos,board);
    }

    @Override
    public Object deepCopy(){
        Knight nw = new Knight(this.white,this.position,this.board);
        nw.setMoved(this.moved);
        return nw;
    }
}
