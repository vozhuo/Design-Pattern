package Order;

/**
 * Created by sdust on 2016/3/30.
 */
public class Meal2SubscribeCommand implements Command {
    Meal2 meal2;

    public Meal2SubscribeCommand(Meal2 meal2) {
        this.meal2 = meal2;
    }

    public void execute() {
        meal2.subscribe();
    }

    public void undo() {
        meal2.cancel();
    }
}
