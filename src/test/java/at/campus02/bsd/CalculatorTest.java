package at.campus02.bsd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals; // if I import as static, I don't have to
import static org.junit.jupiter.api.Assertions.assertThrows;
// call everytime an Assertion.assertEquals

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setup() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd1() {assertEquals(5, calculator.add(2, 3));}

    @Test
    public void testAdd2() {assertEquals(-5, calculator.add(0, -5));}

    @Test
    public void testAdd3() {assertEquals(8.14, calculator.add(3, 5.14));}

    @Test
    public void testAdd4() {assertEquals(4.2, calculator.add(3.2, 1));}

    @Test
    public void testSubstract1() {assertEquals(1, calculator.subtract(5, 4));}

    @Test
    public void testSubstract2() {assertEquals(-10, calculator.subtract(-5, 5));}

    @Test
    public void testSubstract3() {assertEquals(-5.87, calculator.subtract(-5, 0.87));}

    @Test
    public void testSubstract4() {assertEquals(3, calculator.subtract(7, 4));}

    @Test
    public void testMultiply1() {assertEquals(5, calculator.multiply(1, 5));}

    @Test
    public void testMultiply2() {assertEquals(-5.5, calculator.multiply(-2, 2.25));}

    @Test
    public void testMultiply3() {assertEquals(8, calculator.multiply(2, 4));}

    @Test
    public void testMultiply4() {assertEquals(4, calculator.multiply(2, 2));}

    @Test
    public void testDivide() {assertEquals(5, calculator.divide(5, 1));}

    @Test
    public void testDivide2() {assertEquals(-5, calculator.divide(-5, 1));}

    @Test
    public void testDivide3() {assertEquals(7.5, calculator.divide(15, 2));}

    @Test
    public void testDivideDivision0() { assertThrows(ArithmeticException.class, () -> calculator.divide(5, 0));}
    // assertInstanceOf(Integer, test);
    // I can also check if something throws an exeption

}
