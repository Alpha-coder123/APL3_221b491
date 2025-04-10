class Main {
    public static void main(String[] args) {
        Offering offering = new Coffee();
        offering = new Rum(offering);
        offering = new Icecream(offering);
        System.out.println(offering.getName() + " " + offering.getPrice());  
    }
}
