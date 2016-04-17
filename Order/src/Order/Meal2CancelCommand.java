package Order;

/**
 * Created by sdust on 2016/3/30.
 */
public class Meal2CancelCommand implements Command {
    Meal2 meal2;

    public Meal2CancelCommand(Meal2 meal2) {
        this.meal2 = meal2;
    }

    public void execute() {
        meal2.cancel();
    }

    public void undo() {
        meal2.subscribe();
    }
}
