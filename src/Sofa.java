public class Sofa implements Furniture {
    private String name;
    private double weight;
    private double distance;
    private boolean isSectional;

    public Sofa(String name, double weight, double distance, boolean isSectional){
        this.name = name;
        this.weight = weight;
        this.distance = distance;
        this.isSectional = isSectional;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public double getWeight(){
        return weight;
    }

    @Override
    public double getDistance(){
        return distance;
    }

    public boolean isSectional() {
        return isSectional;
    }

    @Override
    public double accept(ShippingCalculator calculator){
        return calculator.computeShipping(this);
    }
}
