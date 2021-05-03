import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void setUp(){
        printer = new Printer(50, 50);
    }

    @Test
    public void hasSheets(){
        assertEquals(50, printer.getSheets());
    }
    @Test
    public void hasToner(){
        assertEquals(50, printer.getToner());
    }
    @Test
    public void canPrint(){
        printer.print(1,2);
        assertEquals(48, printer.getSheets());
        assertEquals(48, printer.getToner());
    }
}
