package Strategy;

/**
 * Created by qyz on 2016/3/5.
 */

//子弹类型接口
interface BulletType {
    void bullet();
}

class BulletNormal implements BulletType {
    public void bullet() { //普通子弹
        System.out.println("I'm can fire!");
    }
}

class BulletWithMissile implements BulletType {
    public void bullet() { //导弹
        System.out.println("I'm can fire with a missile!");
    }
}

//飞行方式接口
interface FlyBehavior {
    void fly();
}

class FlyNormal implements FlyBehavior {
    public void fly() { //普通飞行
        System.out.println("I'm can fly!");
    }
}

class FlyWithAccelerator implements FlyBehavior {
    public void fly() { //加速器飞行
        System.out.println("I'm can fly with a accelerator!");
    }
}

class FlyWithShield implements FlyBehavior {
    public void fly() { //防护罩飞行
        System.out.println("I'm can fly with a shield!");
    }
}

//飞机抽象类
abstract class Plane {
    BulletType bulletType; //子弹类型封装
    FlyBehavior flyBehavior; //飞行方式封装

    public abstract void display(); //输出抽象函数

    //委托给行为类
    public void performBullet() {
        bulletType.bullet();
    }
    public void performFly() {
        flyBehavior.fly();
    }
    //改变子弹类型及飞行方式
    public void setBulletType(BulletType bulletType) { //
        this.bulletType = bulletType;
    }
    public void setFlyBehavior(FlyBehavior flyBehavior) { //
        this.flyBehavior = flyBehavior;
    }
}

//战斗机
class Fighter extends Plane {
    public Fighter() { //实现行为
        bulletType = new BulletNormal();
        flyBehavior = new FlyWithAccelerator();
    }
    public void display() { //输出文字
        System.out.println("I'm a fighter!");
    }
}

//轰炸机
class Bomber extends Plane {
    public Bomber() {
        bulletType = new BulletWithMissile();
        flyBehavior = new FlyNormal();
    }
    public void display() {
        System.out.println("I'm a bomber!");
    }
}

//星舰
class StarShip extends Plane {
    public StarShip() {
        bulletType = new BulletWithMissile();
        flyBehavior = new FlyWithShield();
    }
    public void display() {
        System.out.println("I'm a Starship!");
    }
}

//可升级飞机
class UpgradePlane extends Plane {
    public UpgradePlane() {
        bulletType = new BulletNormal();
        flyBehavior = new FlyNormal();
    }
    public void display() {
        System.out.println("I'm a plane which can upgrade!");
    }
}

//测试函数
public class Test {
    public static void main(String[] args) {
        Fighter fighter = new Fighter();
        fighter.display();
        fighter.performBullet();
        fighter.performFly();

        System.out.println("-----------------");

        Bomber bomber = new Bomber();
        bomber.display();
        bomber.performBullet();
        bomber.performFly();

        System.out.println("-----------------");

        StarShip starship = new StarShip();
        starship.display();
        starship.performBullet();
        starship.performFly();

        System.out.println("-----------------");

        Plane upgrade = new UpgradePlane();
        upgrade.display();
        upgrade.performFly();
        upgrade.setFlyBehavior(new FlyWithAccelerator());
        upgrade.performFly();
    }
}