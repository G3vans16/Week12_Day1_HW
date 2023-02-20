import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class printerTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(50, 100);
    }

    @Test
    public void hasPaper(){
        assertEquals(50, printer.getRemainingPaper());
    }

    @Test
    public void canPrint(){
        printer.print(5, 3);
        assertEquals(35, printer.getRemainingPaper());
    }

    @Test
    public void doesntPrint(){
        printer.print(20, 3);
        assertEquals(50, printer.getRemainingPaper());
    }

    @Test
    public void hasToner(){
        assertEquals(100, printer.getTonerVolume());
    }

    @Test
    public void reducesToner(){
        printer.print(5, 3);
        assertEquals(85, printer.getTonerVolume());
    }

}
