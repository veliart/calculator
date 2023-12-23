package com.example.calculator.service.impl;

import com.example.calculator.exception.DivisionByZeroException;
import com.example.calculator.service.CalculatorService;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

	@Override
	public Integer plus(Integer num1, Integer num2) {
		return num1 + num2;
	}

	@Override
	public Integer minus(Integer num1, Integer num2) {
		return num1 - num2;
	}

	@Override
	public Integer multiply(Integer num1, Integer num2) {
		return num1 * num2;
	}

	@Override
	public double divide(Integer num1, Integer num2) {
		if (num2 == 0) {
			throw new DivisionByZeroException("Делитель равен нулю");
		}
		return (double) num1 / num2;
	}
}
