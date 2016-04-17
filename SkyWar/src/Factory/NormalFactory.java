package Factory;

/**
 * Created by qyz on 2016/3/25.
 */
//普通敌机生产工厂
    public class NormalFactory implements AbstractEnemyFactory {
    public Blood createBlood() {
        return new Blood_b1();
    }

    public Speed createSpeed() {
        return new Speed_s1();
    }

    public Attack createAttack() {
        return new Attack_a1();
    }
}
