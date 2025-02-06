public class DuckMain {
    public static void main(String[] args) {
        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performSwim();
        ((RubberDuck) rubberDuck).performSqueak();

        Duck woodenDuck = new WoodenDuck();
        woodenDuck.display();
        woodenDuck.performSwim();

        Duck redHeadDuck = new RedHeadDuck();
        redHeadDuck.display();
        redHeadDuck.performSwim();
        ((RedHeadDuck) redHeadDuck).fly();
        ((RedHeadDuck) redHeadDuck).quack();

        Duck lakeDuck = new LakeDuck();
        lakeDuck.display();
        lakeDuck.performSwim();
        ((LakeDuck) lakeDuck).fly();
        ((LakeDuck) lakeDuck).quack();
    }
}
