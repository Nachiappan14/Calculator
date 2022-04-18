package calculator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TestExponent {

	@Test
	public void testVariableExponent() {
		Double expected = 125.0;
        Double actual = Exponent.variableExponent(5.0, 3.0);
        Assert.assertEquals(expected, actual);
	}

	@Test
	public void testSquare() {
		Double expected = 64.0;
        Double actual = Exponent.square(-8.0);
        Assert.assertEquals(expected, actual);
	}

	@Test
	public void testCubed() {
		Double expected = -8.0;
        Double actual = Exponent.cubed(-2.0);
        Assert.assertEquals(expected, actual);
	}

	@Test
	public void testSqrt() {
		Double expected = 3.0;
        Double actual = Exponent.sqrt(9.0);
        Assert.assertEquals(expected, actual);
	}

}
