import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class ConverterTest {
    @Test
    public void shouldBeEqualForZeroValueDifferentUnitSameType() throws Exception {
        //given
        Measure inch = new Measure(Type.LENGTH, Unit.INCH, 0.0);
        Measure feet = new Measure(Type.LENGTH, Unit.FEET, 0.0);

        //then
        assertEquals(inch, feet);
    }

    @Test
    public void shouldNotBeEqualForZeroValueDifferentUnitDifferentType() throws Exception {
        //given
        Measure feet = new Measure(Type.LENGTH, Unit.FEET, 0.0);
        Measure gram = new Measure(Type.WEIGHT, Unit.GRAM, 0.0);

        //then
        assertFalse(feet.equals(gram));
    }

    @Test
    public void shouldNotBeEqualForSameValueSameTypeDifferentUnit() throws Exception {
        //given
        Measure feet = new Measure(Type.LENGTH, Unit.FEET, 1.0);
        Measure inch = new Measure(Type.LENGTH, Unit.INCH, 1.0);

        //then
        assertFalse(feet.equals(inch));
    }

    @Test
    public void shouldBeEqualForDifferentUnitSameTypeValueMultipliedByTheConversionFactor() throws Exception {
        //given
        Measure feet = new Measure(Type.LENGTH, Unit.FEET, 1.0);
        Measure inch = new Measure(Type.LENGTH, Unit.FEET, 12);

        //then
        assertEquals(feet,inch);
    }
}
