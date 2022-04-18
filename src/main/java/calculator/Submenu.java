package calculator;

import java.util.Scanner;

public class Submenu {

    public static void arithmeticMenu() {

    	Scanner scanner = new Scanner(System.in);
		println(
                "Pick an operation by entering a number and pressing enter. \n" +
                        "1. Add \n" +
                        "2. Subtract \n" +
                        "3. Multiply \n" +
                        "4. Divide \n" +
                        "5. Return to Arithmetic Menu \n" +
                        "6. Return to Main Menu \n");
		Integer input2 = scanner.nextInt();

        CalcFunction.performArithmeticOperation(input2);


    }

	public static void exponentMenu() {
    	Scanner scanner = new Scanner(System.in);
		println(
                "Pick an operation by entering a number and pressing enter. \n" +
                        "1. Square \n" +
                        "2. Cube \n" +
                        "3. Variable Exponent \n" +
                        "4. Square Root \n" +
                        "5. Return to Exponent Menu \n" +
                        "6. Return to Main Menu \n");
		Integer input2 = scanner.nextInt();

        CalcFunction.performExponentOperation(input2);


    }

    public static void logMenu() {
    	
    	Scanner scanner = new Scanner(System.in);
		println(
                "Pick an operation by entering a number and pressing enter. \n" +
                        "1. Natural Log \n" +
                        "2. Log Base 10 \n" +
                        "3. Return to Log Menu \n"
        );
		Integer input2 = scanner.nextInt();
        
        CalcFunction.performLogarithmOperation(input2);
    }
    

	private static void println(String string) {
		System.out.println(string);
	}
}