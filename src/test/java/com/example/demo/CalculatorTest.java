package com.example.demo;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTest {
    Calculator calculator;

    @BeforeAll
    static void setup(){
    System.out.println("testklassen kommer nu att instansieras");
    }

    @BeforeEach()
    void beforeTests(){
        System.out.println("en testmetod kommer nu köras");
        calculator = new Calculator();
    }


    @Test
    @DisplayName("Adding two numbers should return sum")
    void addingTwoNumbers() {
        int a = 3;
        int b = 2;

        int result = calculator.add(a,b);

        Assertions.assertEquals(5,result);
    }

    @Test
    void addingTwoNumbers_ShouldNotReturnFive(){
        int a = 3;
        int b = 3;

        int result = calculator.add(a,b);

        Assertions.assertNotEquals(5,result);
    }

    @Test
        void addingTwoNegativeNumbers() {
        int a = -3;
        int b = -2;

        int result = calculator.add(a,b);

        Assertions.assertEquals(-5,result);
    }

    @Test
    void subtractingTwoNumbers(){
        int a = 5;
        int b = 3;

        int result = calculator.subtract(a,b);

        Assertions.assertEquals(2,result);
    }

    @Test
    void subtractingTwoNumbers_shouldNotReturnTwo(){
        int a = 5;
        int b = 1;

        int result = calculator.subtract(a,b);

        Assertions.assertNotEquals(2,result);
    }

    @Test
    void subtractingTwoNegativeNumbers(){
        int a = -5;
        int b = -3;

        int result = calculator.subtract(a,b);

        Assertions.assertEquals(-2,result);
    }



    @Test
    void multiplyingTwoNumbers(){
        int a = 5;
        int b = 3;

        int result = calculator.multiply(a,b);

        Assertions.assertEquals(15,result);
    }

    @Test
    void multiplyingTwoNegativeNumbers(){
        int a = -5;
        int b = -3;

        int result = calculator.multiply(a,b);

        Assertions.assertEquals(15,result);
    }

    @Test
    void multiplyingTwoNumbers_shouldNotReturnFifteen(){
        int a = 5;
        int b = 1;

        int result = calculator.multiply(a,b);

        Assertions.assertNotEquals(15,result);
    }


    @Test
    void dividingTwoNumbers(){
        int a = 15;
        int b = 3;

        double result = calculator.divide(a,b);

        Assertions.assertEquals(5,result);
    }

}

