package junit;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

public class Assertions_examples {
	@Tag("Sanity")
	@Test
	public void test1()
	{
		String s1 = "Simplilearn";
		String s2 = "Simplilearn";
		String s3 = "Simplilearn1";
		String s4 = null;
		boolean flag =true;
		boolean flag1 =false;
		int i=5;
		int j=10;
		String expectedarray[] = {"one","two","three"};
		String actualarray[]= {"one","two","three"};
		ArrayList<String> al = new ArrayList();
		al.add("prathiba");
		al.add("Ruchi");
		al.add("divya");
		
		Assertions.assertEquals(s1, s2);
		Assertions.assertNotEquals(s1,s3);
		Assertions.assertNull(s4);
		Assertions.assertNotNull(s1);
		Assertions.assertTrue(true);
		Assertions.assertFalse(false);
		Assertions.assertTrue(i<j);
		Assertions.assertFalse(i>j);
		Assertions.assertArrayEquals(expectedarray,actualarray);
		Assertions.assertFalse(al.contains("vimal"));
		Assertions.assertEquals(3, al.size());
	}

}
