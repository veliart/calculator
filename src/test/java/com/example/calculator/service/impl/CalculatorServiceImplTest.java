package com.example.calculator.service.impl;

import com.example.calculator.exception.DivisionByZeroException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorServiceImplTest {

	private final CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
	@Test
	public void shouldCalculatePlusCorrectly() {
		int num1 = 10, num2 = 20;
		int expectedResult = num1 + num2;
		int actualResult = calculatorService.plus(num1, num2);
		Assertions.assertEquals(expectedResult, actualResult);
	}
	@Test
	public void shouldCalculateMinusCorrectly() {
		int num1 = 10, num2 = 20;
		int expectedResult = num1 - num2;
		int actualResult = calculatorService.minus(num1, num2);
		Assertions.assertEquals(expectedResult, actualResult);
	}
	@Test
	public void shouldCalculateMultiplyCorrectly() {
		int num1 = 10, num2 = 20;
		int expectedResult = num1 * num2;
		int actualResult = calculatorService.multiply(num1, num2);
		Assertions.assertEquals(expectedResult, actualResult);
	}
	@Test
	public void shouldCalculateDivideCorrectly() {
		int num1 = 10, num2 = 20;
		double expectedResult = (double) num1 / num2;
		double actualResult = calculatorService.divide(num1, num2);
		Assertions.assertEquals(expectedResult, actualResult);
	}
	@Test
	public void shouldThrowExceptionWhenTheSecondNumIsNull() {
		int num1 = 10;
		int num2 = 0;
		Assertions.assertThrows(
				DivisionByZeroException.class,
				() -> calculatorService.divide(num1, num2)
		);
	}

}
