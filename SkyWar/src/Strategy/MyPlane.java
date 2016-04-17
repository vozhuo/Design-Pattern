package Strategy;

/**
 * Created by qyz on 2016/3/25.
 */
//玩家飞机
public class MyPlane extends PlayerPlane {
    public MyPlane() {
        iStyleKind = new StyleOne();
        iBulletKind = new BulletLinear();
        System.out.println("Player plane is ready.");
    }

    public int getHP() {
        return 100;
    }

    public int getATK() {
        return 10;
    }
}