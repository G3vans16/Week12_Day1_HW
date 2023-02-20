import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class waterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle(100);
    }

    @Test
    public void waterBottleHasVolume(){
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void drinkFromWaterBottle(){
        waterBottle.drink();
        assertEquals(90, waterBottle.getVolume());
    }

    @Test
    public void emptyWaterBottle(){
        waterBottle.empty();
        assertEquals(0, waterBottle.getVolume());
    }

    @Test
    public void canRefillWaterBottle(){
        waterBottle.refill();
        assertEquals(100, waterBottle.getVolume());
    }
}
