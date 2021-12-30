package model.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	Calculator calculator = new Calculator();

	@Test
	void addTest_양수_양수() {
		assertEquals(7, calculator.add(3, 4));
	}
	
	@Test
	void addTest_양수_음수() {
		assertEquals(-5, calculator.add(5, -10));
	}
	
}
