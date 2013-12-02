import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class ConverterTest {
    @Test
    public void shouldBeEqualIfLengthValueIsZeroAndUnitIsSame() throws Exception {
        Length inch1 = new Length(0, Units.INCH);
        Length inch2 = new Length(0, Units.INCH);
        assertEquals(inch1, inch2);
    }

    @Test
    public void shouldBeEqualIfLengthValueIsZeroAndUnitIsDifferent() throws Exception {
        Length inch = new Length(0, Units.INCH);
        Length feet = new Length(0, Units.FEET);
        assertEquals(inch, feet);
    }

    @Test
    public void shouldNotBeEqualIfLengthValueIsSameAndUnitIsDifferent() throws Exception {
        Length inch = new Length(4, Units.FEET);
        Length feet = new Length(4, Units.INCH);
        assertFalse(feet.equals(inch));
    }

    @Test
    public void shouldBeEqualIfWeightValueIsZeroAndUnitIsSame() throws Exception {
        Weight gram1 = new Weight(0, Units.GRAM);
        Weight gram2 = new Weight(0, Units.GRAM);
        assertEquals(gram1, gram2);
    }

    @Test
    public void shouldBeEqualIfWeightValueIsZeroAndUnitIsDifferent() throws Exception {
        Weight gram = new Weight(0, Units.GRAM);
        Weight kilogram = new Weight(0, Units.KILOGRAM);
        assertEquals(gram, kilogram);
    }

    @Test
    public void shouldNotBeEqualIfWeightValueIsSameAndUnitIsDifferent() throws Exception {
        Weight gram = new Weight(4, Units.GRAM);
        Weight kilogram = new Weight(4, Units.KILOGRAM);
        assertFalse(gram.equals(kilogram));
    }

    @Test
    public void oneFeetShouldBeEqualToTwelveInches() throws Exception {
        Length feet = new Length(1, Units.FEET);
        Length inch = new Length(12, Units.INCH);
        assertEquals(inch, feet);
    }

    @Test
    public void oneKilogramShouldBeEqualToThousandGrams() throws Exception {
        Weight kilogram = new Weight(1, Units.KILOGRAM);
        Weight gram = new Weight(1000, Units.GRAM);
        assertEquals(gram, kilogram);
    }
}
