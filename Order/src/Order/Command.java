package Order;

/**
 * Created by sdust on 2016/3/30.
 */
//命令接口
public interface Command {
    public void execute(); //执行
    public void undo(); //撤销
}