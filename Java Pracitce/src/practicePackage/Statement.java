package practicePackage;

public class Statement {
	
	private String sentence;
	
	public Statement(String statement) {
		//Statement Constructor
		sentence = statement;
	}
	
	public void setStatement(String newStatement) {
		//sets a new Statement
		sentence = newStatement;
	}
	
	public String getStatement() {
		//returns the current statement
		return sentence;
	}
	
	public void printStatement() {
		//prints the statement
		System.out.println(sentence);
	}
}
