// Main.java
public class Main {
    public static void main(String[] args) {
        // Test class is concrete, so we can create an instance and call display()
        Test testObj = new Test();
        testObj.display(); // This will invoke the display method of Test class
        
        // AbsTest is abstract, so we cannot instantiate it directly.
        // But we can create a subclass of AbsTest and implement display() there:
        AbsTest absTestObj = new AbsTest() {
            @Override
            public void display() {
                System.out.println("This is the display method in the anonymous subclass of AbsTest.");
            }
        };
        absTestObj.display(); // This will invoke the display method of the anonymous subclass
    }
}
