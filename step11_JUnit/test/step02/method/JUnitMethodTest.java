package step02.method;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeFalse;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assumptions.assumingThat;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import model.domain.Calculator;

class JUnitMethodTest {
	Calculator calculator = new Calculator(); 
	
	@Test
	@Disabled
	@DisplayName("assertEquals")
	void testAdd() {
		assertEquals(9, calculator.add(4, 6));
		assertEquals(7, calculator.add(3, 3));
	}
	
	@Test
	@Disabled
	@DisplayName("assertAll")
	void assertEqualsTest() {
		assertAll(
				() -> assertEquals(9, calculator.add(4, 6)),
				() -> assertEquals(5, calculator.add(4, 1)),
				() -> assertEquals(8, calculator.add(3, 5)),
				() -> assertEquals(93, calculator.add(49, 53))
				);
	}
	
	@Test
	@Disabled
	@DisplayName("assertArrayEquals")
	void assertArrayEqualsTest() {
		int[] i1 = { 1 };
		int[] i2 = { 4 };
		assertArrayEquals(i1, i2);
	}
	
	@Test
	@Disabled
	void assertSameTest() {
		Object o1 = new Object();
		Object o2 = new Object();

//		assertSame(o1, o2);
		
		String str1 = "String";
		String str2 = "String";

		assertSame(str1, str2);  
	}
	
	@Test
	@Disabled
	void assertTrueFalseTest() {
		assertTrue(8 >= 4);
		assertFalse(0 > 4);
	}
	
	@Test
	@Disabled
	void assertNotNullTest() {
		Object obj = null;
//		assertNotNull(obj);
		assertNull(obj);
	}

	
	@Test
	@Disabled
	@DisplayName("assertTrueFalse")
	void assumeTrueFalseTest() {
		boolean a = 5 > 1; // true
		assertTrue(a); 		
		assumeFalse(a); // 안에 들어간 것이 그냥 falses 라고 보자!
		assertFalse(a);
	}
	
	@Test
	@Disabled
	@DisplayName("assumingThat")
	void assumingThatTest() {
		String str = "String";
		
		assumingThat(
				str.equals("String"),
				() -> System.out.println("참일때 실행되는 메소드"));
	}
	
	@Test
//	@Disabled
	@DisplayName("assertThrows")
	void exceptionTest() {
		assertThrows(ArithmeticException.class, 
					() -> calculator.divide(1, 0)
					);
		ArithmeticException exception = assertThrows(ArithmeticException.class, 
					() -> { int num = 1 / 0; }
					);
		
//		assertEquals("", exception.getMessage());
	}
}
