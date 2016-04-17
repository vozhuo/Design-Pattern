package Factory;

/**
 * Created by qyz on 2016/3/25.
 */
public abstract class EnemyPlane {
    //参数
    String name;
    Blood blood;
    Speed speed;
    Attack attack;

    abstract void prepare();

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}