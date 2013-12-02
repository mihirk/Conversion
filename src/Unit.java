public interface Unit {


    public boolean isAValidUnitForType(Unit unitName);


    public double getConversionFactor(Unit unit1, Unit unit2);

//    {
//        if (unit1 == Unit.FEET) {
//            return 12;
//        }
//        else if(unit1 == Unit.KILOGRAM){
//            return 1000;
//        }
//        else return 1;
//
//    }
}
