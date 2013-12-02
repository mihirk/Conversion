import java.util.HashMap;

public class Length extends AMeasure {


    protected Length(double value, Unit unitName) {
        super(value, unitName);
    }

    @Override
    protected double getConversionFactor(Unit unit1, Unit unit2) {
        return validUnits.get(unit1)/validUnits.get(unit2);
    }

    @Override
    protected HashMap<Unit, Double> initializeValidUnits(HashMap<Unit, Double> validUnits) {
        validUnits.put(Unit.FEET, 12d);
        validUnits.put(Unit.INCH, 1d);

        return validUnits;
    }

}
