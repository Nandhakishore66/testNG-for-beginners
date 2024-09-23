package testNGPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionPrac {
    
	@Test
	public void method() {
		String name="Naveen";
		Assert.assertEquals("Naveen", name);

	}

}
