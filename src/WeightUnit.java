public enum WeightUnit implements Unit {
    GRAM, KILOGRAM;


    @Override
    public boolean isAValidUnitForType(Unit unitName) {
        if (unitName.equals(GRAM) || unitName.equals(KILOGRAM)) {
            return true;
        }
        return false;
    }

    @Override
    public double getConversionFactor(Unit unit1, Unit unit2) {
        return 1000;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
