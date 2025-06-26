import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    // Setup: Runs before each test
    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setup: Calculator initialized.");
    }

    // Teardown: Runs after each test
    @After
    public void tearDown() {
        System.out.println("Teardown: Test complete.\n");
    }

    @Test
    public void testAddition() {
        // Arrange
        int a = 10;
        int b = 5;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(15, result);
    }

    @Test
    public void testSubtraction() {
        // Arrange
        int a = 10;
        int b = 3;

        // Act
        int result = calculator.subtract(a, b);

        // Assert
        assertEquals(7, result);
    }
}
