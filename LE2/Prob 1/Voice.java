// Voice.java
public class Voice {
    // Method to prepare the animals
    public void prepareVoice() {
        // Create an array of type Animal with 5 elements
        Animal[] animals = new Animal[5];

        // Assign different Animal objects to the array
        animals[0] = new Cow();
        animals[1] = new Dog();
        animals[2] = new Pig();
        animals[3] = new Goat();
        animals[4] = new Lion();

        // Call hear method to produce the sounds
        hear(animals);
    }

    // Method to hear the voice of each animal
    public void hear(Animal[] animals) {
        // Loop through the array and call makeVoice() on each animal
        for (Animal animal : animals) {
            animal.makeVoice();  // Polymorphism in action
        }
    }
}
