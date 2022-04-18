package calculator;

import org.junit.Assert;
import org.junit.Test;

public class TestLog {

	@Test
	public void testNaturalLog() {
		Double expected = 2.0794415416798357;
        Double actual = Log.naturalLog(8D);
        Assert.assertEquals(expected, actual);
	}

	@Test
	public void testLogBaseTen() {
		Double expected = 1.6094379124341003;
        Double actual = Log.naturalLog(5D);
        Assert.assertEquals(expected, actual);
	}

}
