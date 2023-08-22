import org.primes.PrimeNumbers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class PrimeNumbersTest {

    @ParameterizedTest
    @ValueSource(ints = {2, 3, 5, 7, 11, 13, 19, 23, 29, 41, 101, 1_000_003})
    @DisplayName("Test numbers that are prime")
    public void testIsPrime_ShouldReturnTrue(int testInput) {
        PrimeNumbers primeNumbers = new PrimeNumbers();

        boolean actual = primeNumbers.isPrime(testInput);

        assertTrue(actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {4, 6, 8, 9, 10, 27, 33, 39, 1_000_002})
    @DisplayName("Test numbers that are not prime")
    public void testIsPrime_ShouldReturnFalse(int testInput) {
        PrimeNumbers primeNumbers = new PrimeNumbers();

        boolean actual = primeNumbers.isPrime(testInput);

        assertFalse(actual);
    }
}
