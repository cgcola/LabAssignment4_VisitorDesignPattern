import java.util.*;

public class StandardShipping implements ShippingCalculator {
    private static Map<String, Double> rateMap = new HashMap<>();

    static {
        rateMap.put("Office Chair", 15.0);
        rateMap.put("Dining Table", 30.0);
        rateMap.put("Living Room Sofa (Sectional)", 50.0);
    }

    @Override
    public double computeShipping(Chair chair) {
        // Chair: Flat base rate + (weight * 5) + (distance * 10)
        double baseRate = rateMap.get(chair.getName());
        return baseRate + (chair.getWeight() * 5.0) + (chair.getDistance() * 10.0);
    }

    @Override
    public double computeShipping(Table table) {
        // Table: (Area * Base rate) + (weight * 5) + (distance * 10)
        double areaRate = table.getArea() * rateMap.get(table.getName());
        return areaRate + (table.getWeight() * 5.0) + (table.getDistance() * 10.0);
    }

    @Override
    public double computeShipping(Sofa sofa){
        // Sofa: Base rate + (weight * 10) + (distance * 20) + Handling fee
        double baseRate = rateMap.get(sofa.getName());
        double sectionalFee = sofa.isSectional() ? 500.0 : 0.0;
        return baseRate + (sofa.getWeight() * 10.0) + (sofa.getDistance() * 20.0) + sectionalFee;
    }

}
