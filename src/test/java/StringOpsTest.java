import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class StringOpsTest {

	@DisplayName("hello passing in Blank")
	@Test 
	void Should_ReturnStringHelloBlank_When_GivenBlank () {
		String expects = "Hello there";
		String received = StringOps.hello("");
		assertEquals(expects, received);
	}
	@DisplayName("hello passing with a Name")
	@Test 
	void Should_ReturnStringHelloName () {
		String expects = "Hello Joshuan";
		String received = StringOps.hello("Joshuan");
		assertEquals(expects, received);
	}
	
	@DisplayName("ispalindrome ")
	@Test
	void Should_ReturnTrueWhenPalindrome () {
		StringOps t = new StringOps();
		boolean result = t.isPalindrome("Treat");
		assertFalse(result);
	}

	@DisplayName("flipFlop different signs")
	@Test
	void Should_ReturnTrue_When_Palindrome () {
		StringOps t = new StringOps ();
		boolean result = t.isPalindrome("3553");
		assertTrue(result);
	}

	@DisplayName(" Trim all spaces ")
	@Test
	void Should_ReturnTrueWhenremovedallspaces() {
		String expects = "Sophia";
		String received = StringOps.hello("  Sophia   ");
		assertEquals(expects, received);
	}

	@DisplayName("Remove only before and after")
	@Test
	void Should_ReturnFalseWhenremovedsomespaces() {
		String expects = "Kenji";
		String received = StringOps.hello("  Ken ji  ");
		assertEquals(expects, received);
	}

}
