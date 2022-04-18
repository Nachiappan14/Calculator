package calculator;

import java.lang.Math ;

public class Exponent{

    public static Double variableExponent(Double baseNum, Double exp1) {
        Double output = Math.pow(baseNum, exp1);
        println( "\n" + output);
        return output;
    }

	public static Double square(Double baseNum) {
        Double output = Math.pow(baseNum, 2);
        println( "\n" + output);
        return output;
    }

    public static Double cubed(Double baseNum) {
        Double output = Math.pow(baseNum, 3);
        println( "\n" + output);
        return output;
    }

    public static Double sqrt(Double baseNum) {
        Double output = Math.sqrt(baseNum);
        println( "\n" + output);
        return output;
    }
	private static void println(String string) {
		System.out.println(string);
	}
}