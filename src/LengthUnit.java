public enum LengthUnit implements Unit {
    INCH, FEET;

    @Override
    public boolean isAValidUnitForType(Unit unitName) {
        if (unitName.equals(INCH) || unitName.equals(FEET)) {
            return true;
        }
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public double getConversionFactor(Unit unit1, Unit unit2) {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
