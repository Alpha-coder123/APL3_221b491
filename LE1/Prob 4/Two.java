public class Two extends One {
    public Two(int x) {
        // Explicitly calling the parameterized constructor of One
        super(x);
        System.out.println("Constructor in Two, x = " + x);
    }
}
