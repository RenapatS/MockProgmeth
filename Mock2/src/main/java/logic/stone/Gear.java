package logic.stone;

import logic.game.GameManager;

public class Gear extends HardStone{
    private int upgradeValue;

    public Gear(int posX, int posY){
        super(posX, posY,2);
        this.setUpgradeValue(1);
    }
    public Gear(int posX, int posY, int upgradeValue){
        super(posX, posY,2);
        this.setUpgradeValue(upgradeValue);
    }
    public void destroy(){
        int add = getUpgradeValue();
        super.destroy();
        GameManager.getInstance().addDigPower(add);
    }
    public int getUpgradeValue() {
        if(upgradeValue<1)upgradeValue=1;
        return upgradeValue;
    }

    public void setUpgradeValue(int upgradeValue) {
        if(upgradeValue<1)upgradeValue=1;
        this.upgradeValue = upgradeValue;
    }
}
