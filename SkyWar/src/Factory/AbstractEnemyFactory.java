package Factory;

/**
 * Created by qyz on 2016/3/25.
 */
//抽象工厂接口
public interface AbstractEnemyFactory {
    public Blood createBlood();
    public Speed createSpeed();
    public Attack createAttack();
}