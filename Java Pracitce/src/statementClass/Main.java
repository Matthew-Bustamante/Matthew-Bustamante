package statementClass;

public class Main {
	public static void main(String[] args) {
		
		Statement myStatement = new Statement("Hello");
		myStatement.printStatement();
		myStatement.setStatement("Hello There");
		myStatement.printStatement();
		myStatement.setStatement("Hola");
		myStatement.printStatement();
	}

}
