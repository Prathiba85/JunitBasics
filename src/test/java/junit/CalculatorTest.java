package junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import code.Calculator;

public class CalculatorTest {
	
	//@Disabled
	@DisplayName("Two Positive number Test")
	@Test // you have to use junit.jupiter.api
	public void TC001_positive_number() {
		int added_result = Calculator.add(4, 5);

		Assertions.assertEquals(9, added_result);
		// System.out.println(added_result);

	}
	@RepeatedTest(3)
	@DisplayName("One Positive and One negative number Test")
	//@Test
	public void TC002_positive_number() {
		int added_result = Calculator.add(-4, 5);

		Assertions.assertEquals(1, added_result);
		// System.out.println(added_result);

	}
	@Tag("Sanity")
	@Tag("Regression")
	@DisplayName("Two negative number Test")
	@Test
	public void TC003_negative_number() {
		int added_result = Calculator.add(4, 5);

		Assertions.assertNotEquals(10, added_result);
		// System.out.println(added_result);

	}
	@CustomAnnotation
	public void TC004() {
		int added_result = Calculator.add(4,5);

		Assertions.assertNotEquals(10, added_result);
		// System.out.println(added_result);

	}

}
