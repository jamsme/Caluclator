package com.codingdojo.calculatorOne;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator one = new Calculator();
		Calculator two = new Calculator();
		
		one.setOperandOne(10);
		one.setOperation("+");
		one.setOperandTwo(11);

		two.setOperation("-");
		two.setOperandOne(10);
		two.setOperandTwo(100);
		one.getResult();
		two.getResult();
	}
}
