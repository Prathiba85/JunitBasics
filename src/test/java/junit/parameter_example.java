package junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import code.String_functions;

public class parameter_example {
	
	@ParameterizedTest
	@ValueSource(strings= {"madam","dad","radar"})
	public void test1(String value)
	{
		Assertions.assertTrue(String_functions.palindrome(value));
	
	}
	@Tag("Sanity")
	@ParameterizedTest
	@ValueSource(ints= {20,30,40})
	public void test2(int num)
	{
		Assertions.assertTrue(num%2==0);
	}

}
