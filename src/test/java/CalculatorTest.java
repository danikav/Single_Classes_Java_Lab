import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void setUp(){
        calculator = new Calculator();
    }

    @Test
    public void canAdd() {
        assertEquals(4, calculator.add(2,2));
    }
    @Test
    public void canSubtract(){
        assertEquals(4, calculator.subtract(8,4));
    }
    @Test
    public void canMultiply(){
        assertEquals(6, calculator.multiply(2, 3));
    }
    @Test
    public void canDivide(){
        assertEquals(3, calculator.divide(6.0, 2.0), 0.01);
    }

}
