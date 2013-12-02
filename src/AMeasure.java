public abstract class AMeasure {

    protected double value;
    protected Unit unit;

    public AMeasure(double value, Unit unitName) {
        this.factory(value, unitName);
    }

    protected abstract double convert(Object o, Unit unit);

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
        return aMeasure.convert(aMeasure, this.unit) != this.value;
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

    public void factory(double value, Unit unitName) {
        this.value = value;
        if (this.unit.isAValidUnitForType(unitName)) {
            this.unit = unitName;
        }
    }
}
