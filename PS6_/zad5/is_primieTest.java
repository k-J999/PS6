import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MathUtilsTest {

    @Test
    public void testIsPrimePositive() {
        assertTrue(MathUtils.isPrime(2));
        assertTrue(MathUtils.isPrime(3));
        assertTrue(MathUtils.isPrime(5));
        assertTrue(MathUtils.isPrime(7));
    }

    @Test
    public void testIsPrimeNegative() {
        assertFalse(MathUtils.isPrime(4));
        assertFalse(MathUtils.isPrime(6));
        assertFalse(MathUtils.isPrime(8));
        assertFalse(MathUtils.isPrime(9));
    }

    @Test
    public void testIsPrimeSmallNumbers() {
        assertFalse(MathUtils.isPrime(1));
        assertFalse(MathUtils.isPrime(0));
        assertFalse(MathUtils.isPrime(-1));
    }

    @Test
    public void testIsPrimeLargePrime() {
        assertTrue(MathUtils.isPrime(104729));  // Liczba pierwsza
    }
}
