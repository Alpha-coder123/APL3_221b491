public class WoodenDuck extends Duck {
    public WoodenDuck() {
        swimBehavior = new Swim();
    }

    public void display() {
        System.out.println("I'm a Wooden Duck.");
    }
}
