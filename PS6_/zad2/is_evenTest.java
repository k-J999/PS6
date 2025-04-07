import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MathUtilsTest {

    @Test
    public void testIsEvenPositive() {
        assertTrue(MathUtils.isEven(4));
        assertTrue(MathUtils.isEven(10));
        assertTrue(MathUtils.isEven(0));
    }

    @Test
    public void testIsEvenNegative() {
        assertFalse(MathUtils.isEven(3));
        assertFalse(MathUtils.isEven(7));
        assertFalse(MathUtils.isEven(-1));
    }

    @Test
    public void testIsEvenZero() {
        assertTrue(MathUtils.isEven(0));
    }

    @Test
    public void testIsEvenLargeNumber() {
        assertTrue(MathUtils.isEven(1000000000000L));
    }
}

