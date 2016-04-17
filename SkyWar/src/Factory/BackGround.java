package Factory;

/**
 * Created by qyz on 2016/3/25.
 */
//根据不同类型组装敌机
public class BackGround {
    public void createEnemyPlane(String type) {
        EnemyPlane enemyPlane = null;
        AbstractEnemyFactory abstractEnemyFactory = null;
        if (type.equals("Normal")) {
            abstractEnemyFactory = new NormalFactory();
            enemyPlane = new Normal(abstractEnemyFactory);
            enemyPlane.setName("Normal plane");
            enemyPlane.prepare();
        } else if (type.equals("Boss")) {
            abstractEnemyFactory = new BossFactory();
            enemyPlane = new Boss(abstractEnemyFactory);
            enemyPlane.setName("Boss plane");
            enemyPlane.prepare();
        } else {
            System.out.println("Wrong Type!");
        }
    }
}