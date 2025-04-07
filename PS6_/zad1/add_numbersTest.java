import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MathUtilsTest {

    @Test
    public void testAddNumbersPositive() {
        assertEquals(8, MathUtils.add_numbers(3, 5));
    }

    @Test
    public void testAddNumbersPositiveNegative() {
        assertEquals(-2, MathUtils.add_numbers(3, -5));
    }

    @Test
    public void testAddNumbersNegative() {
        assertEquals(-8, MathUtils.add_numbers(-3, -5));
    }

    @Test
    public void testAddNumbersWithZero() {
        assertEquals(5, MathUtils.add_numbers(0, 5));
    }
}

