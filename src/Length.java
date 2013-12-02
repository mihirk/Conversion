public class Length extends AMeasure {

    public Length(double value, Unit unitName) {
        super(value, unitName);
    }


    @Override
    protected double convert(Object o, Unit unit) {
        Length length = (Length) o;
        return length.unit.getConversionFactor(length.unit, unit) * length.value;
        //what i want here is a class where different data members are available to different calls from different types of objects.
    }
//
//    @Override
//    public void factory(double value, Unit unitName) {
//        this.value = value;
//        if(unitName.equals(Unit.INCH) || unitName.equals(Unit.FEET)){
//            this.unit = unitName;
//        }
//    }
}
