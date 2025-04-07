import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TempConverterTest {

    @Test
    public void testCelsiusToFahrenheitStandard() {
        assertEquals(32, TempConverter.celsiusToFahrenheit(0), 0.01);
        assertEquals(212, TempConverter.celsiusToFahrenheit(100), 0.01);
    }

    @Test
    public void testCelsiusToFahrenheitNegative() {
        assertEquals(14, TempConverter.celsiusToFahrenheit(-10), 0.01);
    }

    @Test
    public void testCelsiusToFahrenheitLarge() {
        assertEquals(1832, TempConverter.celsiusToFahrenheit(1000), 0.01);
    }

    @Test
    public void testCelsiusToFahrenheitZero() {
        assertEquals(32, TempConverter.celsiusToFahrenheit(0), 0.01);
    }
}
