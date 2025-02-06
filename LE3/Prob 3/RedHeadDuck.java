public class RedHeadDuck extends Duck implements FlyBehavior, QuackBehavior {
    public RedHeadDuck() {
        swimBehavior = new Swim();
    }

    public void display() {
        System.out.println("I'm a RedHead Duck.");
    }

    public void fly() {
        new FlyWithWings().fly();
    }

    public void quack() {
        new Quack().quack();
    }
}
