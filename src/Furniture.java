public interface Furniture {
    double accept(ShippingCalculator calculator);
    String getName();
    double getWeight();
    double getDistance();
}