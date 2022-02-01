package practicePackage;

public class Main {
	public static void main(String[] args) {
		
		Statement myStatement = new Statement("Hello");
		myStatement.printStatement();
		myStatement.setStatement("Hello There");
		myStatement.printStatement();
		myStatement.setStatement("Hola");
		myStatement.printStatement();
		myStatement.setStatement("Well Now");
		myStatement.printStatement();
	}

}
