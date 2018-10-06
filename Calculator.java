package com.codingdojo.calculatorOne;

@SuppressWarnings("serial")
public class Calculator implements java.io.Serializable{
	private int numOne;
	private int numTwo;
	private String operation;
	
	public Calculator(){
	};

	public Calculator(int numOne, int numTwo, String operation) {
		this.setOperandOne(numOne);
		this.setOperation(operation);
		this.setOperandTwo(numTwo);
	};
	
	
	// Setter
	public void setOperandOne(int numOne) {
		this.numOne = numOne;
	};
	
	// Getter
	public int getOperandOne() {
		return numOne;
	};
	
	// Setter
	public void setOperandTwo(int numTwo) {
		this.numTwo = numTwo;
	};
	
	// Getter
	public int getOperandTwo() {
		return numTwo;
	};
	
	// Setter
	public void setOperation(String operation) {
		this.operation = operation;
	};
	
	// Getter
	public String getOperation() {
		return operation;
	};
	
	public double performOperation() {
		double c = 0;
		if (operation == "+") {
			c = numOne + numTwo;
		}
		else if (operation == "-") {
			c = numOne - numTwo;
		}
		return c;
	}
	
	public double getResult() {
		Double c = performOperation();
		System.out.println(c);
		return c;
	};
	
}
