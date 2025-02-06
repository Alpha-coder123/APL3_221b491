public abstract class Duck {
    SwimBehavior swimBehavior;

    public void performSwim() {
        swimBehavior.swim();
    }

    public abstract void display();
}
