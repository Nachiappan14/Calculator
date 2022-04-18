package calculator;

public class Arithmetic {

    public static Double addition (Double d, Double d2){
        Double output = d + d2;
        println("\n" + output);
        return output;
    }

    public static Double subtraction (Double d, Double d2){
        Double output = d - d2;
        println("\n" + output);
        return output;
    }

    public static Double division (Double d, Double d2) {
        Double output = d / d2;
        println("\n" + output);
        return output;
    }

    public static Double multiplication (Double d, Double d2 ){
        Double output = d * d2;
        println("\n" + output);
        return output;
    }
   
    private static void println(String string) {
		System.out.println(string);
	}
}