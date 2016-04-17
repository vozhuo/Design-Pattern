package Factory;

/**
 * Created by qyz on 2016/3/25.
 */
//Boss生产工厂
public class BossFactory implements AbstractEnemyFactory {
    public Blood createBlood() {
        return new Blood_b2();
    }

    public Speed createSpeed() {
        return new Speed_s2();
    }

    public Attack createAttack() {
        return new Attack_a2();
    }
}
