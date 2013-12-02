import java.util.HashMap;

public class Temperature extends AMeasure {

    protected Temperature(double value, Unit unitName) {
        super(value, unitName);
    }

    @Override
    protected double getConversionFactor(Unit unit1, Unit unit2) {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    protected HashMap<Unit, Double> initializeValidUnits(HashMap<Unit, Double> validUnits) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
