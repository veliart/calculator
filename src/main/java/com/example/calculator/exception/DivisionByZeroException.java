package com.example.calculator.exception;

public class DivisionByZeroException extends IllegalArgumentException {
	public DivisionByZeroException(String s) {
		super(s);
	}
}
