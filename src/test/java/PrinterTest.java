import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before() {
        printer = new Printer(10,10);
    }

    @Test
    public void shouldPrint() {
        assertEquals(6, printer.print(7));
    }

    @Test
    public void shouldNotPrint() {
        assertEquals(20, printer.print(30));
    }
}
