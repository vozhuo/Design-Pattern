package Order;

    //测试函数
    public class Main {

        public static void main(String[] args) {
            //创建应用控制器
            Application application = new Application();
            //创建Meal对象
            Meal meal = new Meal();
            Meal2 meal2 = new Meal2();
            Meal3 meal3 = new Meal3();
            //Meal的订购与退订命令
            MealSubscribeCommand mealSubscribeCommand = new MealSubscribeCommand(meal);
            MealCancelCommand mealCancelCommand = new MealCancelCommand(meal);
            Meal2SubscribeCommand meal2SubscribeCommand = new Meal2SubscribeCommand(meal2);
            Meal2CancelCommand meal2CancelCommand = new Meal2CancelCommand(meal2);
            Meal3SubscribeCommand meal3SubscribeCommand = new Meal3SubscribeCommand(meal3);
            Meal3CancelCommand meal3CancelCommand = new Meal3CancelCommand(meal3);
            //设置命令
            application.setCommand(0, mealSubscribeCommand, mealCancelCommand);
            application.setCommand(1, meal2SubscribeCommand, meal2CancelCommand);
            application.setCommand(2, meal3SubscribeCommand, meal3CancelCommand);
            //应用控制器控制命令
            application.appSubscribe(0);
            application.appCancel(0);
            application.appSubscribe(1);
            application.appCancel(1);
            application.appSubscribe(2);
            application.appCancel(2);
            //撤销命令
            System.out.println("----------Undo-------------");
            application.undoAppOperation();
        }
    }
