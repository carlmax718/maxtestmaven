package onecircle.core.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = Util.class)
class UtilityTest {
	
	@Test
	void testGetMapFromJsonString() {
		//fail("Not yet implemented");
	}

	@Test
	void testFormatStringToNumber() {
		//fail("Not yet implemented");
	}

	@Test
	void testIsStringUppercase1() {
		boolean isUpper = Util.isStringUppercase("abc");
		assertFalse(isUpper);
	}
	
	@Test
	void testIsStringUppercase() {
		boolean isUpper = Util.isStringUppercase("ABC");
		assertTrue(isUpper);
	}

	@Test
	void testIsValidTicker1() {
		boolean isValid = Util.isValidTicker("abc");
		assertFalse(isValid);
	}
	
	@Test
	void testIsValidTicker2() {
		boolean isValid = Util.isValidTicker("abc.a.b");
		assertFalse(isValid);
	}

	@Test
	void testIsValidTicker3() {
		boolean isValid = Util.isValidTicker("ABC.A.B");
		assertFalse(isValid);
	}
	
	@Test
	void testIsValidTicker4() {
		boolean isValid = Util.isValidTicker("ABC");
		assertTrue(isValid);
	}
	
	@Test
	void testIsValidTicker5() {
		boolean isValid = Util.isValidTicker("ABC.A");
		assertTrue(isValid);
	}
	
	@Test
	void testIsValidTicker6() {
		boolean isValid = Util.isValidTicker("ABC.a");
		assertFalse(isValid);
	}
}
