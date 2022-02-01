package practicePackage;

public class Statement {
	
	private String sentence;
	
	public Statement(String statement) {
		sentence = statement;
	}
	
	public void setStatement(String newStatement) {
		sentence = newStatement;
	}
	
	public String getStatement() {
		return sentence;
	}
	
	public void printStatement() {
		System.out.println(sentence);
	}
}
