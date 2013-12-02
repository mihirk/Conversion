import java.util.HashMap;

public class Weight extends AMeasure {


    protected Weight(double value, Unit unitName) {
        super(value, unitName);
    }

    @Override
    protected HashMap<Unit, Double> initializeValidUnits(HashMap<Unit, Double> validUnits) {
        validUnits.put(Unit.GRAM, 1d);
        validUnits.put(Unit.KILOGRAM, 1000d);
        return validUnits;
    }


}
