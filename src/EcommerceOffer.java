public class EcommerceOffer {
    public static void main(String[] args) {
        // Chair: 10.5 lbs, going 15 km
        Chair myChair = new Chair("Office Chair", 10.5, 15.0);
        // Table: 5x3 area, 45.0 lbs, going 15 km
        Table myTable = new Table("Dining Table", 5.0, 3.0, 45.0, 15.0);
        // Sofa: 120.0 lbs, going 25 km, is a sectional (true)
        Sofa mySofa = new Sofa("Living Room Sofa (Sectional)", 120.0, 25.0, true);

        ShippingCalculator calculator = new StandardShipping();

        System.out.println("Standard Shipping of " + myChair.getName() + " is PHP " + myChair.accept(calculator));

        System.out.println("Standard Shipping of " + myTable.getName() + " is PHP " + myTable.accept(calculator));

        System.out.println("Standard Shipping of " + mySofa.getName() + " is PHP " + mySofa.accept(calculator));
    }
}
