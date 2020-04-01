package testsUnitaires;

import java.nio.charset.MalformedInputException;

import org.junit.Assert;
import org.junit.Test;

public class test {

	Addition addition = new Addition();

	@Test
	public void testNormal() {

		// teste que 1 + 1 => 2
		Assert.assertEquals(2, addition.additionner(1, 1));
	}

	@Test
	public void testWithNull() {

		// teste que 1 + null => 1
		Assert.assertEquals(1, addition.additionner(1, null));
	}

	@Test
	public void testBothNull() {

		// teste que null + null=> 0
		Assert.assertEquals(0, addition.additionner(null, null));
	}

}
