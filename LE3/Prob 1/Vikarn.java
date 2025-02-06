// Vikarn.java
public class Vikarn extends Kaurav {
    // Vikarn is noble and obedient, unlike other Kauravs.
    @Override
    public void disobey() {
        // Vikarn doesn't disobey, he is obedient.
        System.out.println("Vikarn is obedient.");
    }

    @Override
    public void cruel() {
        // Vikarn is not cruel, he is kind.
        System.out.println("Vikarn is kind-hearted.");
    }

    @Override
    public void fight() {
        System.out.println("Vikarn fights honorably.");
    }
}
