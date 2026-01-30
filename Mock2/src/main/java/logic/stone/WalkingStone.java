package logic.stone;

import logic.game.GameManager;
import utils.GameUtilities;

public class WalkingStone extends Stone{
    public WalkingStone(int posX, int posY) {
        super(posX, posY);
    }
    public void dig(int digPower){
        super.dig(digPower);
        if(digPower>1){
            GameManager.getInstance().setGameScore(GameManager.getInstance().getGameScore()+1);
        }
    }
    public void walk(){
        GameUtilities.moveWalkingRock(this);
    }
}
