import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FibonacciSumTests {
    private static FibonacciSum fibonacciSum;
    private int testNum;

    @BeforeAll
    public static void setUpBeforeAll() {
        System.out.println("Starting tests.");
        fibonacciSum = new FibonacciSum();
    }

    @BeforeEach
    public void setUpBeforeEach() {
        testNum = 15;
    }

    @Test
    public void test() throws IllegalAccessException {
        assertEquals(1596, fibonacciSum.findSum(testNum));
    }

    @AfterAll
    static void finish() {
        System.out.println("Finished test.");
    }
}
