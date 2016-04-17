package Skywar;

import Factory.*;
import Observer.PlaneData;
import Observer.PlayerInfo;
import Strategy.*;

//测试函数
public class Main {
    public static void main(String[] args) {
        //策略模式
        PlayerPlane playerPlane = new MyPlane();
        playerPlane.performStyle();
        playerPlane.performBullet();
        System.out.println("------------------");

        //装饰者模式
        System.out.println("Initial HP:" + playerPlane.getHP() + " ATK:" + playerPlane.getATK());
        playerPlane = new Decorator.Bullet(playerPlane);
        playerPlane = new Decorator.Ally(playerPlane);
        playerPlane = new Decorator.Bomb(playerPlane);
        playerPlane = new Decorator.Armor(playerPlane);
        System.out.println("Armed HP:" + playerPlane.getHP() + " ATK:" + playerPlane.getATK());
        System.out.println("------------------");

        //工厂模式
        BackGround backGround = new BackGround();
        backGround.createEnemyPlane("Normal");
        backGround.createEnemyPlane("Boss");
        System.out.println("------------------");

        //观察者模式
        PlaneData planeData = new PlaneData();
        PlayerInfo playerInfo = new PlayerInfo(planeData);
        planeData.setMeasurements(90, 16);
    }
}