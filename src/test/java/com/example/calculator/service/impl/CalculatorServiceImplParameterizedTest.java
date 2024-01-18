package com.example.calculator.service.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculatorServiceImplParameterizedTest {
	private final CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
	private static Stream<Arguments> provideNumbersForCalculator() {
		return Stream.of(
				Arguments.of(10,20),
				Arguments.of(0, 2),
				Arguments.of(-10,-30),
				Arguments.of(-10000, 30)
		);
	}
	@ParameterizedTest
	@MethodSource("provideNumbersForCalculator")
	public void shouldCalculatePlusCorrectly(int num1, int num2) {
		int expectedResult = num1 + num2;
		int actualResult = calculatorService.plus(num1, num2);
		Assertions.assertEquals(expectedResult, actualResult);
	}

	@ParameterizedTest
	@MethodSource("provideNumbersForCalculator")
	public void shouldCalculateMinusCorrectly(int num1, int num2) {
		int expectedResult = num1 - num2;
		int actualResult = calculatorService.minus(num1, num2);
		Assertions.assertEquals(expectedResult, actualResult);
	}
	@ParameterizedTest
	@MethodSource("provideNumbersForCalculator")
	public void shouldCalculateMultiplyCorrectly(int num1, int num2) {
		int expectedResult = num1 * num2;
		int actualResult = calculatorService.multiply(num1, num2);
		Assertions.assertEquals(expectedResult, actualResult);
	}
	@ParameterizedTest
	@MethodSource("provideNumbersForCalculator")
	public void shouldCalculateDivideCorrectly(int num1, int num2) {
		double expectedResult = (double) num1 / num2;
		double actualResult = calculatorService.divide(num1, num2);
		Assertions.assertEquals(expectedResult, actualResult);
	}
}
