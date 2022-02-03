package statementClass;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void twoPlusTwoShouldEqualFour() {
		var calculator = new Calculator(2, 2);
		assertEquals(4, calculator.add());
	}

}
