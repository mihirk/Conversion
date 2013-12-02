import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class ConverterTest {
    @Test
    public void shouldBeEqualIfLengthValueIsZeroAndUnitIsSame() throws Exception {
        Length inch1 = new Length(0, Unit.INCH);
        Length inch2 = new Length(0, Unit.INCH);
        assertEquals(inch1, inch2);
    }

    @Test
    public void shouldBeEqualIfLengthValueIsZeroAndUnitIsDifferent() throws Exception {
        Length inch = new Length(0, Unit.INCH);
        Length feet = new Length(0, Unit.FEET);
        assertEquals(inch, feet);
    }

    @Test
    public void shouldNotBeEqualIfLengthValueIsSameAndUnitIsDifferent() throws Exception {
        Length inch = new Length(4, Unit.FEET);
        Length feet = new Length(4, Unit.INCH);
        assertFalse(feet.equals(inch));
    }

    @Test
    public void shouldBeEqualIfWeightValueIsZeroAndUnitIsSame() throws Exception {
        Weight gram1 = new Weight(0, Unit.GRAM);
        Weight gram2 = new Weight(0, Unit.GRAM);
        assertEquals(gram1, gram2);
    }

    @Test
    public void shouldBeEqualIfWeightValueIsZeroAndUnitIsDifferent() throws Exception {
        Weight gram = new Weight(0, Unit.GRAM);
        Weight kilogram = new Weight(0, Unit.KILOGRAM);
        assertEquals(gram, kilogram);
    }

    @Test
    public void shouldNotBeEqualIfWeightValueIsSameAndUnitIsDifferent() throws Exception {
        Weight gram = new Weight(4, Unit.GRAM);
        Weight kilogram = new Weight(4, Unit.KILOGRAM);
        assertFalse(gram.equals(kilogram));
    }

    @Test
    public void oneFeetShouldBeEqualToTwelveInches() throws Exception {
        Length feet = new Length(1, Unit.FEET);
        Length inch = new Length(12, Unit.INCH);
        assertEquals(inch, feet);
    }

    @Test
    public void oneKilogramShouldBeEqualToThousandGrams() throws Exception {
        Weight kilogram = new Weight(2, Unit.KILOGRAM);
        Weight gram = new Weight(2000, Unit.GRAM);
        assertEquals(gram, kilogram);
    }

    @Test
    public void twentyFourInchesShouldBeEqualToTwoFeet() throws Exception {
        Length feet = new Length(1.0, Unit.FEET);
        Length inch = new Length(12.0, Unit.INCH);
        assertEquals(feet, inch);
    }

    @Test
    public void testName() throws Exception {


    }
}
