package Order;

/**
 * Created by sdust on 2016/3/30.
 */

//应用控制器
public class Application {
    Command[] subscribeCommand;
    Command[] cancelCommand;
    Command undoCommand; //撤销命令

    public Application() {
        subscribeCommand = new Command[3];
        cancelCommand = new Command[3];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 3; i++) {
            subscribeCommand[i] = noCommand;
            cancelCommand[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int type, Command subscribeCommand, Command cancelCommand) {
        this.subscribeCommand[type] = subscribeCommand;
        this.cancelCommand[type] = cancelCommand;
    }

    public void appSubscribe(int type) {
        subscribeCommand[type].execute();
        undoCommand = subscribeCommand[type];
    }

    public void appCancel(int type) {
        cancelCommand[type].execute();
        undoCommand = cancelCommand[type];
    }

    public void undoAppOperation() {
        undoCommand.undo();
    }
}