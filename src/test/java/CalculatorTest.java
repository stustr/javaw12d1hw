import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {


    @Test
    public void canAdd() {
        assertEquals(3, Calculator.add(2, 1));
    }

    @Test
    public void canSubtract() {
        assertEquals(1, Calculator.subtract(2, 1));
    }

    @Test
    public void canMultiply() {
        assertEquals(2, Calculator.multiply(2, 1));
    }

    @Test
    public void canDivide() {
        assertEquals(2.00, Calculator.divide(2.00, 1.00), 0.0);
    }
}
