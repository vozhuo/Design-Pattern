package Decorator;

import Strategy.PlayerPlane;

/**
 * Created by qyz on 2016/3/25.
 */
public class Bomb extends Strategy.PlayerPlane {
    PlayerPlane playerPlane;

    public Bomb(PlayerPlane playerPlane) {
       this.playerPlane = playerPlane;
        System.out.println("Player has a bomb.");
    }

    public int getATK() {
        return playerPlane.getATK() + 1;
    }

    public int getHP() {
        return playerPlane.getHP();
    }
}