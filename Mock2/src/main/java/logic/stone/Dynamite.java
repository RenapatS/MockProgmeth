package logic.stone;

import utils.GameUtilities;

import java.util.ArrayList;

public class Dynamite extends Stone{
    public Dynamite(int posX, int posY){
        super(posX, posY);
    }
    public void destroy(){
        ArrayList<Stone> des = GameUtilities.getAdjacentStones(this.posX,this.posY);
        GameUtilities.removeStone(this);
        for(Stone x: des){
            GameUtilities.removeStone(x);
        }
    }
}
