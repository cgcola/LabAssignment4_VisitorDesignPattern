public class Table implements Furniture {
    private String name;
    private double weight;
    private double distance;
    private double length;
    private double width;

    public Table(String name, double length, double width, double weight, double distance){
        this.name = name;
        this.length = length;
        this.width = width;
        this.weight = weight;
        this.distance = distance;
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

    public double getArea() {
        return length * width;
    }

    @Override
    public double accept(ShippingCalculator calculator){
        return calculator.computeShipping(this);
    }
}
