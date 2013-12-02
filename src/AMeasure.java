import javax.xml.bind.ValidationException;
import java.util.HashMap;

public abstract class AMeasure {

    protected double value;
    protected Unit unit;
    protected HashMap<Unit, Double> validUnits;


    protected AMeasure(double value, Unit unitName) {
        this.factory(value, unitName, validUnits);
    }

    protected double convert(Unit unit) {
        return this.getConversionFactor(this.unit, unit) * this.value;
    }

    protected abstract double getConversionFactor(Unit unit1, Unit unit2);

    protected abstract HashMap<Unit, Double> initializeValidUnits(HashMap<Unit, Double> validUnits);


    protected void factory(double value, Unit unitName, HashMap<Unit, Double> validUnits) {
        this.value = value;
        this.validUnits = new HashMap<Unit, Double>();
        this.validUnits = this.initializeValidUnits(this.validUnits);
        if (this.validUnits.containsKey(unitName)) {
            this.unit = unitName;
        } else {
            throw new IllegalArgumentException(new ValidationException("Illegal Unit"));
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (isObjectInValid(o)) return false;

        AMeasure aMeasure = (AMeasure) o;

        if (valueInEqualityCheck(aMeasure)) return false;
        if (unitInEqualityCheck(aMeasure)) return false;

        return true;
    }

    private boolean isObjectInValid(Object o) {
        return o == null || isClassNotEqual(o);
    }

    private boolean unitInEqualityCheck(AMeasure aMeasure) {
        if (isUnitNotEqual(aMeasure) && isValueNotZero() && isNotEqualAfterConversion(aMeasure)) return true;
        return false;
    }

    private boolean valueInEqualityCheck(AMeasure aMeasure) {
        if (isValueNotEqual(aMeasure) && isNotEqualAfterConversion(aMeasure)) return true;
        return false;
    }

    private boolean isValueNotZero() {
        return value != 0;
    }

    private boolean isUnitNotEqual(AMeasure aMeasure) {
        return unit != aMeasure.unit;
    }

    private boolean isValueNotEqual(AMeasure aMeasure) {
        return Double.compare(aMeasure.value, value) != 0;
    }

    private boolean isClassNotEqual(Object o) {
        return getClass() != o.getClass();
    }


    private boolean isNotEqualAfterConversion(AMeasure aMeasure) {
        return aMeasure.convert(this.unit) != this.value;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(value);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (unit != null ? unit.hashCode() : 0);
        return result;
    }

}
