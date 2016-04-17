package Factory;

/**
 * Created by qyz on 2016/3/25.
 */
//Boss产品
public class Boss extends EnemyPlane {
    AbstractEnemyFactory abstractEnemyFactory;

    public Boss(AbstractEnemyFactory abstractEnemyFactory) {
        this.abstractEnemyFactory = abstractEnemyFactory;
    }

    void prepare() {
        System.out.println("Generating " + name + ":");
        blood = abstractEnemyFactory.createBlood();
        speed = abstractEnemyFactory.createSpeed();
        attack = abstractEnemyFactory.createAttack();
    }
}