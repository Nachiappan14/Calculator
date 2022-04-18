package calculator;
import java.lang.Math;

public class Log{

    public static Double naturalLog (Double a)
    {
        Double output= Math.log(a);
        println( "\n" + output);
        return output;
    }

    public static Double logBaseTen (Double a)
    {
        Double output = Math.log10(a);
        println( "\n" + output);
        return output;

    }

	private static void println(String string) {
		System.out.println(string);
	}

}
