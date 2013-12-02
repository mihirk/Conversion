public class Weight extends AMeasure {

    public Weight(double value, Unit unitName) {
        super(value, unitName);
    }


    @Override
    protected double convert(Object o, Unit unit) {
        Weight weight = (Weight) o;
        return weight.unit.getConversionFactor(weight.unit, unit) * weight.value;

    }
}
