package Decorator;

import Strategy.PlayerPlane;

/**
 * Created by qyz on 2016/3/25.
 */
public class Ally extends Strategy.PlayerPlane {
    PlayerPlane playerPlane;

    public Ally(PlayerPlane playerPlane) {
        this.playerPlane = playerPlane;
        System.out.println("Player has an ally.");
    }

    public int getATK() {
        return playerPlane.getATK() + 3;
    }

    public int getHP() {
        return playerPlane.getHP();
    }
}
