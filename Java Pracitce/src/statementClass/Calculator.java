package statementClass;

public class Calculator {
	//variables to keep track of the numbers
	private int number1;
	private int number2;
	
	public Calculator(int numberOne, int numberTwo) {
		//calculator constructor
		number1 = numberOne;
		number2 = numberTwo;
	}
	
	public int add() {
		//adds the two numbers
		return number1 + number2;
	}
	
	public int subtract() {
		//subtracts the two numbers
		return number1 - number2;
	}
	
	public int multiply() {
		//multiplies the two numbers
		return number1 * number2;
		}
	
	public int divide() {
		//divides the two numbers
		return number1 / number2;
		}
	}

