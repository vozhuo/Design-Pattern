package Strategy;

/**
 * Created by qyz on 2016/3/25.
 */
//飞机抽象类
public abstract class PlayerPlane {
    private int HP = 0;
    private int ATK = 0;

    IBulletKind iBulletKind; //子弹类型封装
    IStyleKind iStyleKind; //飞机样式封装

    //public void display();

    //获取HP、ATK值
    public int getHP() { return HP; }
    public int getATK() {
        return ATK;
    }
    //委托给行为类
    public void performBullet() {
        iBulletKind.bullet();
    }
    public void performStyle() {
        iStyleKind.style();
    }
    //改变子弹类型及飞机样式
    public void setIBulletKind(IBulletKind iBulletKind) { //
        this.iBulletKind = iBulletKind;
    }
    public void setIStyleKind(IStyleKind iStyleKind) { //
        this.iStyleKind = iStyleKind;
    }
}