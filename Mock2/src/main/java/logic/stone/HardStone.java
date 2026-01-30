package logic.stone;

import utils.GameUtilities;

import javax.swing.text.Utilities;

public class HardStone extends Stone{
    protected int durability;
    public HardStone(int posX, int posY, int durability){
        super(posX, posY);
        setDurability(durability);
    }
    public void dig(int digPower){
        if(getDurability()<=digPower){
            this.destroy();
        }
        setDurability(getDurability()-digPower);
    }

    public int getDurability() {
        if(durability<0)durability=0;
        else if(durability>5)durability=5;
        return durability;
    }

    public void setDurability(int durability) {
        if(durability<0)durability=0;
        else if(durability>5)durability=5;
        this.durability = durability;
    }
}
