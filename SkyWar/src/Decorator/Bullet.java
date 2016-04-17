package Decorator;

import Strategy.PlayerPlane;

/**
 * Created by qyz on 2016/3/25.
 */
public class Bullet extends Strategy.PlayerPlane {
    PlayerPlane playerPlane;

    public Bullet(PlayerPlane playerPlane) {
        this.playerPlane = playerPlane;
        System.out.println("Player's bullet is updated");
    }

    public int getATK() {
        return playerPlane.getATK() + 2;
    }

    public int getHP() {
        return playerPlane.getHP();
    }
}
