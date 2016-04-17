package Order;

/**
 * Created by sdust on 2016/3/30.
 */

//退订Meal
public class MealCancelCommand implements Command {
    Meal meal;

    public MealCancelCommand(Meal meal) {
        this.meal = meal;
    }

    public void execute() {
        meal.cancel();
    }

    public void undo() {
        meal.subscribe();
    }
}
