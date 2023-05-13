package junit;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import code.String_functions;

public class palindrome_check {
	
	@Test
	public void TC01_check_palindrome()
	{
		boolean actual_value = String_functions.palindrome("madam");
		//System.out.println(actual_value);
		Assert.assertTrue(actual_value);
		
	}
	@Test
	public void TC02_check_palindrome()
	{
		boolean actual_value = String_functions.palindrome("prathiba");
		//System.out.println("For Prathiba: "+actual_value);
		Assert.assertFalse(actual_value);
		
	}

}
