import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author lmoesle
 */
class CountingNumbersTest {
    CountingNumbers countingNumbers;

    @BeforeEach
    public void setUp() {
        this.countingNumbers = new CountingNumbers();
    }

    @Test
    public void testCountingNumbersReturnsInteger() {
        assertEquals(this.countingNumbers.countNumbers("Test").getClass(), Integer.class);
    }

    @Test
    public void testCountingNumbersReturnsTheNumberOfCharacters() {
        assertEquals(this.countingNumbers.countNumbers("Hello World"), 11);
    }
}