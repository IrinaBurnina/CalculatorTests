package lyambda;

import org.junit.jupiter.api.*;

public class CalculatorTests {
    @BeforeAll
    public static void beforeAll() {
        System.out.println("Calculator tests are started.");
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

    @Test
    public void calculatorMinusTest() {
        //arrange
        int a = 2;
        int b = 1;
        int c = 1;
        //act
        int result = calculator.minus.apply(a, b);
        //assert
        Assertions.assertEquals(c, result);
    }

    @Test
    public void calculatorMultiplyTest() {
        //arrange
        int a = 2;
        int b = 1;
        int c = 2;
        //act
        int result = calculator.multiply.apply(a, b);
        //assert
        Assertions.assertEquals(c, result);
    }

    @Test
    public void calculatorDivideTest() {
        //arrange
        int a = 2;
        int b = 1;
        int c = 2;
        //act
        int result = calculator.divide.apply(a, b);
        //assert
        Assertions.assertEquals(c, result);
    }

    @Test
    public void calculatorPlusTest() {
        //arrange
        int a = 2;
        int b = 1;
        int c = 3;
        //act
        int result = calculator.plus.apply(a, b);
        //assert
        Assertions.assertEquals(c, result);
    }

    @Test
    public void calculatorAbsTest() {
        //arrange
        int a = -2;
        int b = 2;
        //act
        int result = calculator.abs.operator(a);
        //assert
        Assertions.assertEquals(b, result);
    }

    @Test
    public void calculatorPowTest() {
        //arrange
        int a = -2;
        int b = 4;
        //act

        int result = calculator.pow.operator(a);
        //assert

        Assertions.assertEquals(b, result);
    }

    @Test
    public void calculatorIsPositiveTest() {
        //arrange
        int a = -2;
        //act
        boolean result = calculator.isPositive.isPositive(a);
        //assert
        Assertions.assertFalse(result);
    }
}
