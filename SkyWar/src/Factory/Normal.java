package Factory;

/**
 * Created by qyz on 2016/3/25.
 */
//普通敌机产品
public class Normal extends EnemyPlane {
    AbstractEnemyFactory abstractEnemyFactory;

    public Normal(AbstractEnemyFactory abstractEnemyFactory) {
        this.abstractEnemyFactory = abstractEnemyFactory;
    }

    void prepare() {
        System.out.println("Generating " + name + ":");
        blood = abstractEnemyFactory.createBlood();
        speed = abstractEnemyFactory.createSpeed();
        attack = abstractEnemyFactory.createAttack();
    }
}