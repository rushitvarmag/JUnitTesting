package jUnitTestingPackage;
import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitFunction jUnit = new jUnitFunction();
		String result = jUnit.AddStrings("Aadi", "Jain");
		assertEquals("AadiJain", result);
	}

}
