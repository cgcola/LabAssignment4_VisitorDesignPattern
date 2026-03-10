public  class Chair implements Furniture {
    private String name;
    private double weight;
    private double distance;

    public Chair(String name, double weight, double distance){
        this.name = name;
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

    @Override
    public double accept(ShippingCalculator calculator){
        return calculator.computeShipping(this);
    }
}
