public class LakeDuck extends Duck implements FlyBehavior, QuackBehavior {
    public LakeDuck() {
        swimBehavior = new Swim();
    }

    public void display() {
        System.out.println("I'm a Lake Duck.");
    }

    public void fly() {
        new FlyWithWings().fly();
    }

    public void quack() {
        new Quack().quack();
    }
}
