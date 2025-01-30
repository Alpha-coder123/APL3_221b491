// Voice2.java
public class Voice2 {
    // Template Method: This method ensures the correct order of method calls
    public void templateMethod() {
        prepareVoice();  // First, prepare the animals
        hear();          // Then, hear their voices
    }

    // Method to prepare the animals
    private void prepareVoice() {
        // Create an array of type Animal with 5 elements
        Animal[] animals = new Animal[5];

        // Assign different Animal objects to the array
        animals[0] = new Cow();
        animals[1] = new Dog();
        animals[2] = new Pig();
        animals[3] = new Goat();
        animals[4] = new Lion();

        // Set the animals array as a field to be accessed by the hear method
        this.animals = animals;
    }

    // Method to hear the voice of each animal
    private void hear() {
        // Loop through the array and call makeVoice() on each animal
        for (Animal animal : animals) {
            animal.makeVoice();  // Polymorphism in action
        }
    }

    // Field to hold the array of animals
    private Animal[] animals;
}
