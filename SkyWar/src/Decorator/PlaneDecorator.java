package Decorator;

/**
 * Created by qyz on 2016/3/25.
 */
//装饰者抽象类
public abstract class PlaneDecorator extends Strategy.PlayerPlane {
    public abstract int getHP();
    public abstract int getATK();
}
