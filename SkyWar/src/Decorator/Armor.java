package Decorator;

import Strategy.PlayerPlane;

/**
 * Created by qyz on 2016/3/25.
 */
public class Armor extends Strategy.PlayerPlane {
    PlayerPlane playerPlane;

    public Armor(PlayerPlane playerPlane) {
        this.playerPlane = playerPlane;
        System.out.println("Player has a armor.");
    }

    public int getATK() {
        return playerPlane.getATK();
    }

    public int getHP() {
        return playerPlane.getHP() + 20;
    }
}
