// Main.java
public class Main {
    public static void main(String[] args) {
        // Pandav objects
        Arjun arjun = new Arjun();
        arjun.fight();  // Arjun is a fighter
        arjun.obey();   // Arjun obeys
        arjun.kind();   // Arjun is kind
        arjun.showSkills();  // Arjun's specific skill

        Bheem bheem = new Bheem();
        bheem.fight();  // Bheem is a fighter
        bheem.obey();   // Bheem obeys
        bheem.kind();   // Bheem is kind
        bheem.showStrength();  // Bheem's strength

        // Kaurav objects
        Duryodhan duryodhan = new Duryodhan();
        duryodhan.fight();  // Duryodhan is a fighter
        duryodhan.disobey();  // Duryodhan disobeys
        duryodhan.cruel();  // Duryodhan is cruel
        duryodhan.showAmbition();  // Duryodhan's ambition

        Vikarn vikarn = new Vikarn();
        vikarn.fight();  // Vikarn fights honorably
        vikarn.disobey();  // Vikarn is obedient
        vikarn.cruel();  // Vikarn is kind
    }
}
