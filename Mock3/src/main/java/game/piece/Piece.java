package game.piece;

import game.board.Board;
import game.position.Position;
import game.util.Movement;

import java.util.Set;

public class Piece {
    protected boolean white;
    protected boolean moved;
    protected Position position;
    protected Board board;

    public Piece(boolean white, Position position, Board board){
//        this.moved = false;
        this.white = white;
        this.position = position;
        this.board = board;
        board.placePiece(this, position);
    }

    public Set<Position> getLegalMove(){
        Movement ob = new Movement(position,board);
        ob.getMovePositions(this);
        return ob.getMoves();
    }
    public Object deepCopy(){
        Piece nw = new Piece(this.white,this.position,this.board);
        setMoved(this.moved);
        return nw;
    }
    public String toString(){
        return getClass().getSimpleName() + getPosition();
    }
    public void moveHandle(Position to){
        hadMoved();
        setPosition(to);
    }
    public boolean hadMoved(){
        setMoved(true);
        return true;
    }

    @Override
    public boolean equals(Object o) {
        Piece other = (Piece) o;
        return this.white == other.white &&
                this.position.equals(other.position) &&
                this.board == other.board;
    }

    public boolean isWhite() {
        return white;
    }

    public void setWhite(boolean white) {
        this.white = white;
    }

    public boolean isMoved() {
        return moved;
    }

    public void setMoved(boolean moved) {
        this.moved = moved;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }
}
