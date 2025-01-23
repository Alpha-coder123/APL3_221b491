// Main.java - This is the Application class that contains the main method
public class Main {
    public static void main(String[] args) {
        
        Parent p = new Parent();
        p.show(); // Call show() method of Parent class
        
               Child ch = new Child();
        ch.show(); // Call inherited show() method from Parent class
    }
}
