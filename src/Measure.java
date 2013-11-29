public class Measure {
    private final double value;
    private final Type typeName;
    private final Unit unitName;

    public Measure(Type typeName, Unit unitName, double value) {
        this.typeName = typeName;
        this.value = value;
        this.unitName = unitName;
    }                           `

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || checkClassTypeEquality(o)) return false;

        Measure measure = (Measure) o;

        if (isTypeUnEqual(measure)) return false;
        if (isValueUnEqual(measure) && !isUnitUnEqual(measure)) return false;
        if (isUnitUnEqual(measure)){
            if(){
            }
            else return false;
        }

        return true;
    }



    private boolean checkClassTypeEquality(Object o) {
        return getClass() != o.getClass();
    }

    private boolean isUnitUnEqual(Measure measure) {
        return unitName != measure.unitName && value != 0;
    }

    private boolean isValueUnEqual(Measure measure) {
        return Double.compare(measure.value, value) != 0;
    }

    private boolean isTypeUnEqual(Measure measure) {
        return typeName != measure.typeName;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(value);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + typeName.hashCode();
        result = 31 * result + unitName.hashCode();
        return result;
    }
}
