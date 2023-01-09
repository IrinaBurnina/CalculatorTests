package lyambda;

import org.junit.jupiter.api.*;

public class CalculatorTests {
    @BeforeAll
    public static void beforeAll() {
        System.out.println("Calculator tests are completed.");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Calculator tests are completed.");

    }

    Calculator calculator;

    @BeforeEach
    public void beforeEach() {
        System.out.println("Test is started.");
        calculator = new Calculator();
    }

    @AfterEach
    public void afterEach() {
        calculator = null;
        System.out.println("Test is completed.");
    }

    @org.junit.jupiter.api.Test
    public void calculatorApplyTest() {
        //arrange
        int a = 2;
        int b = 1;
        int c = 1;
        int d = 2;
        int e = 2;
        int f = 3;
        //act
        int result = calculator.minus.apply(a, b);
        int result2 = calculator.multiply.apply(a, b);
        int result3 = calculator.divide.apply(a, b);
        int result4 = calculator.plus.apply(a, b);
        //assert
        Assertions.assertEquals(c, result);
        Assertions.assertEquals(d, result2);
        Assertions.assertEquals(e, result3);
        Assertions.assertEquals(f, result4);
    }

    @org.junit.jupiter.api.Test
    public void calculatorOperatorTest() {
        //arrange
        int a = -2;
        int b = 2;
        int c = 4;
        //act
        int result = calculator.abs.operator(a);
        int result2 = calculator.pow.operator(a);
        //assert
        Assertions.assertEquals(b, result);
        Assertions.assertEquals(c, result2);
    }

    @org.junit.jupiter.api.Test
    public void calculatorIsPositiveTest() {
        //arrange
        int a = -2;
        //act
        boolean result = calculator.isPositive.isPositive(a);
        //assert
        Assertions.assertFalse(result);
    }
}
