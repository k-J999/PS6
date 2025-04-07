import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MathUtilsTest {

    @Test
    public void testFactorialSmallNumbers() {
        assertEquals(1, MathUtils.factorial(0));
        assertEquals(1, MathUtils.factorial(1));
        assertEquals(2, MathUtils.factorial(2));
    }

    @Test
    public void testFactorialLargerNumbers() {
        assertEquals(120, MathUtils.factorial(5));
        assertEquals(3628800, MathUtils.factorial(10));
    }

    @Test
    public void testFactorialNegative() {
        assertThrows(IllegalArgumentException.class, () -> MathUtils.factorial(-1));
    }

    @Test
    public void testFactorialLargeNumber() {
        assertEquals(2432902008176640000L, MathUtils.factorial(20));
    }
}
