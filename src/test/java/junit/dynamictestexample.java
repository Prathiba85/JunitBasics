package junit;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import code.String_functions;

public class dynamictestexample {
	@TestFactory
	public Collection<DynamicTest> method1()
	{
		return Arrays.asList(
		//It has two parameter --> display name and lamda expression
		DynamicTest.dynamicTest("Positive Test",()->Assertions.assertTrue(String_functions.palindrome("madam"))),
		DynamicTest.dynamicTest("Negative Test",()->Assertions.assertFalse(String_functions.palindrome("prahtiba")))
		);	
		
	}

}
