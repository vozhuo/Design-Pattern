package Strategy;

/**
 * Created by qyz on 2016/3/25.
 */
//直线子弹
public class BulletLinear implements IBulletKind {
    public void bullet() {
        System.out.println("Fire with linear bullet.");
    }
}