package dsa.solutions.goldmansachs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeAndValidityTest {

    @Test
    void isValid() {
        // General test cases
        Assertions.assertEquals(PrimeAndValidity.isValid(10, 2), 1); // Valid divisible number
        Assertions.assertEquals(PrimeAndValidity.isValid(2, 2), 0);  // Edge case: both are primes
        Assertions.assertEquals(PrimeAndValidity.isValid(10, 3), 1); // Divisible number
        Assertions.assertEquals(PrimeAndValidity.isValid(7, 3), 1);  // Prime number check
        Assertions.assertEquals(PrimeAndValidity.isValid(3, 5), 0);  // Both are primes, not valid
        Assertions.assertEquals(PrimeAndValidity.isValid(8, 4), 1);  // One is divisible by another

        // Edge cases with large numbers
        Assertions.assertEquals(PrimeAndValidity.isValid(1000000, 2), 1);  // Large divisible number
        Assertions.assertEquals(PrimeAndValidity.isValid(999983, 3), 1);   // Large prime with non-prime divisor
        Assertions.assertEquals(PrimeAndValidity.isValid(17, 19), 0);      // Two large primes, not valid
        Assertions.assertEquals(PrimeAndValidity.isValid(2, 999983), 0);   // Small prime with large prime

        // Cases with 1 and 0
        Assertions.assertEquals(PrimeAndValidity.isValid(1, 2), 0); // 1 is not prime
        Assertions.assertEquals(PrimeAndValidity.isValid(0, 10), 0); // 0 is not valid

        // Negative numbers (if supported by the logic)
        Assertions.assertEquals(PrimeAndValidity.isValid(-10, 5), 0); // Negative number should not be valid
        Assertions.assertEquals(PrimeAndValidity.isValid(-7, 3), 0);  // Negative number with prime

        // Additional edge cases
        Assertions.assertEquals(PrimeAndValidity.isValid(1, 1), 0);   // 1 is not prime
        Assertions.assertEquals(PrimeAndValidity.isValid(13, 13), 0); // Same prime number, not valid
        Assertions.assertEquals(PrimeAndValidity.isValid(12, 4), 1);  // Divisible number
        Assertions.assertEquals(PrimeAndValidity.isValid(29, 2), 0);  // Prime with non-divisible number
    }
}
