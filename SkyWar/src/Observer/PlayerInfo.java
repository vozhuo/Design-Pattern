package Observer;

import Strategy.PlayerPlane;

/**
 * Created by qyz on 2016/3/26.
 */
//飞机信息布告板
public class PlayerInfo implements Observer, DisplayElement {
    private int HP;
    private int ATK;
    private Subject planedata;

    public PlayerInfo(Subject planedata) {
        this.planedata = planedata;
        planedata.registerObserver(this); //注册
    }

    public void update(int HP, int ATK) {
        this.HP = HP;
        this.ATK = ATK;
        display();
    }
    public void display() {
        //System.out.println("Player plane current HP:" + HP + " ATK:" + ATK);
    }
}