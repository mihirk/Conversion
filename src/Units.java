public enum Units implements Unit {
    KILOGRAM, GRAM, INCH, FEET;

    @Override
    public boolean isAValidUnitForType(Unit unitName) {
        return true;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public double getConversionFactor(Unit unit1, Unit unit2) {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
