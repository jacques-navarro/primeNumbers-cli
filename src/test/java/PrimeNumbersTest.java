import org.junit.jupiter.params.provider.CsvSource;
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

    @ParameterizedTest
    @CsvSource({"3, 3", "5, 5", "41, 41", "101, 101", "563, 563", "997, 997", "1_000_003, 1_000_003"})
    @DisplayName("Test if given number is the next prime")
    public void testNextPrime_CurrentNumberIsPrime_ShouldReturnSameNumber(int testInput, int expected) {
        PrimeNumbers primeNumbers = new PrimeNumbers();

        int actual = primeNumbers.nextPrime(testInput);

        assertEquals(actual, expected);
    }

    @ParameterizedTest
    @CsvSource({"14, 17", "15, 17", "16, 17", "17, 17"})
    @DisplayName("Test if 17 the next prime")
    public void testNextPrime_ShouldReturn17(int testInput, int expected) {
        PrimeNumbers primeNumbers = new PrimeNumbers();

        int actual = primeNumbers.nextPrime(testInput);

        assertEquals(actual, expected);
    }

    @ParameterizedTest
    @CsvSource({"40, 41", "41, 41"})
    @DisplayName("Test if 41 is the next prime")
    public void testNextPrime_ShouldReturn41(int testInput, int expected) {
        PrimeNumbers primeNumbers = new PrimeNumbers();

        int actual = primeNumbers.nextPrime(testInput);

        assertEquals(actual, expected);
    }

    @ParameterizedTest
    @CsvSource({"54, 59", "55, 59", "56, 59", "54, 59", "57, 59", "58, 59", "59, 59", })
    @DisplayName("Test if 59 is the next prime")
    public void testNextPrime_ShouldReturn59(int testInput, int expected) {
        PrimeNumbers primeNumbers = new PrimeNumbers();

        int actual = primeNumbers.nextPrime(testInput);

        assertEquals(actual, expected);
    }
}
