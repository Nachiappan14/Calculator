package calculator;

import static org.junit.Assert.*;

import org.junit.Assert;

import calculator.Arithmetic;
import org.junit.Test;


public class TestArithmetic {

	@Test
	public void testAddition() {
        Double expected = 14.0;
        Double actual = Arithmetic.addition( 13.0, 1.0);
        Assert.assertEquals(expected, actual);
	}

	@Test
	public void testSubtraction() {
		Double expected = 30.0;

       
        Double actual = Arithmetic.subtraction( 45.0, 15.0);

        Assert.assertEquals(expected, actual);
	}

	@Test
	public void testSubtraction2() {
		Double expected = -30.0;

       
        Double actual = Arithmetic.subtraction( -15.0, 15.0);

        Assert.assertEquals(expected, actual);
	}

	@Test
	public void testDivision() {
		Double expected = 7.0;

        Double actual = Arithmetic.division( 14.0, 2.0);

        Assert.assertEquals(expected, actual);
	}

	@Test
	public void testMultiplication() {
        Double expected = 40.0;

        Double actual = Arithmetic.multiplication( 20.0, 2.0);

        Assert.assertEquals(expected, actual);
    }

}
