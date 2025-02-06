public class RubberDuck extends Duck {
    public RubberDuck() {
        swimBehavior = new Swim();
    }

    public void display() {
        System.out.println("I'm a Rubber Duck.");
    }

    public void performSqueak() {
        new Squeak().squeak();
    }
}
