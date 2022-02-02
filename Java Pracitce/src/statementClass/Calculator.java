package statementClass;

public class Calculator {
	private int number1;
	private int number2;
	
	public Calculator(int numberOne, int numberTwo) {
		number1 = numberOne;
		number2 = numberTwo;
	}
	
	public int add() {
		return number1 + number2;
	}
	
	public int subtract() {
		return number1 - number2;
	}
	
	public int multiply() {
		return number1 * number2;
		}
	
	public int divide() {
		return number1 / number2;
		}
	}

