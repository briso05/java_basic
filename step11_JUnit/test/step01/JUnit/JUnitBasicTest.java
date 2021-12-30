package step01.JUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JUnitBasicTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("모든 테스트 메소드 실행 전 : 딱 한 번 실행(ex. DB)");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("모든 테스트 메소드 실행 후 : 딱 한 번 실행(ex. DB)");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("각 테스트 메소드 실행 전");
		
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("각 테스트 메소드 실행 후");
	}

	@Test // 게시글
	void test() {
		System.out.println("테스트 메소드 실행1");
	}

	@Test
	void 이것도_테스트() {
		System.out.println("테스트 메소드 실행2");
	}

}
