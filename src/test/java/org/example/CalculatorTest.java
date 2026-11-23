package org.example;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
public class CalculatorTest {
    private Calculator calculator;
    @BeforeEach
    void preparer() {
        calculator = new Calculator();
    }
    @Test
    void testAddition() {
        assertEquals(5, calculator.addition(2, 3));
        assertEquals(0, calculator.addition(-1, 1));
    }
    @Test
    void testSoustraction() {
        assertEquals(2, calculator.soustraction(5, 3));
        assertEquals(-2, calculator.soustraction(3, 5));
    }
    @Test
    void testMultiplication() {
        assertEquals(6, calculator.multiplication(2, 3));
        assertEquals(0, calculator.multiplication(5, 0));
    }
    @Test
    void testDivision() {
        assertEquals(2.5, calculator.division(5, 2), 0.001);
        assertEquals(3.0, calculator.division(9, 3), 0.001);
    }
    @Test
    void testDivisionParZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculator.division(10, 0);
        });
        assertEquals("Division par zéro impossible", exception.getMessage());
    }
    @Test
    void testNouvelleFonction() {
    // Test d'une opération simple
        assertEquals(10, calculator.multiplication(2, 5));
        assertEquals(-10, calculator.multiplication(2, -5));
    }
}