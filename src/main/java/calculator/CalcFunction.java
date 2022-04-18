package calculator;

import java.util.Scanner;

public class CalcFunction {
	
    static Double num1;
    static Double num2;

    public static void performArithmeticOperation(Integer selection) {

    	Scanner scanner = new Scanner(System.in);
        switch (selection) {
            case 1:
            	println("format: a + b ");
	        	println("Enter a");
	            num1 = scanner.nextDouble();
	            println("Enter b");
	            num2 = scanner.nextDouble();
                Arithmetic.addition(num1, num2);
                CalcMenu.calculatorMenu();
                break;
            case 2:
            	println("format: a - b ");
	        	println("Enter a");
	            num1 = scanner.nextDouble();
	            println("Enter b");
	            num2 = scanner.nextDouble();
                Arithmetic.subtraction(num1, num2);
                CalcMenu.calculatorMenu();
                break;
            case 3:
            	println("format: a * b ");
	        	println("Enter a");
	            num1 = scanner.nextDouble();
	            println("Enter b");
	            num2 = scanner.nextDouble();
                Arithmetic.multiplication(num1, num2);
                CalcMenu.calculatorMenu();
                break;
            case 4:
            	println("format: a / b ");
	        	println("Enter a");
	            num1 = scanner.nextDouble();
	            println("Enter b");
	            num2 = scanner.nextDouble();
                Arithmetic.division(num1, num2);
                CalcMenu.calculatorMenu();
                break;
            case 5:
                Submenu.arithmeticMenu();
                break;
            case 6:
            	CalcMenu.calculatorMenu();
                break;
            default:
                println("Invalid selection. Please try again.");
                Submenu.arithmeticMenu();

        }


    }

    public static void performExponentOperation (Integer selection) {
    	
    	Scanner scanner = new Scanner(System.in);
        switch (selection) {
            case 1:
            	println("Enter a number.");
                num1 = scanner.nextDouble();
                Exponent.square(num1);
                CalcMenu.calculatorMenu();
                break;
            case 2:
            	println("Enter a number.");
                num1 = scanner.nextDouble();
                Exponent.cubed(num1);
                CalcMenu.calculatorMenu();
                break;
            case 3:
            	println("format: log(a) base(b)");
	        	println("Enter a");
	            num1 = scanner.nextDouble();
	            println("Enter b");
	            num2 = scanner.nextDouble();
	            Exponent.variableExponent(num1, num2);
                CalcMenu.calculatorMenu();
                break;
            case 4:
            	println("Enter a number.");
                num1 = scanner.nextDouble();
                Exponent.sqrt(num1);
                CalcMenu.calculatorMenu();
            case 5:
                Submenu.exponentMenu();
                break;
            case 6:
                CalcMenu.calculatorMenu();
                break;
            default:
                println("Invalid selection. Please try again.");
                Submenu.exponentMenu();
        }

    }

    public static void performLogarithmOperation (Integer selection) {

    	Scanner scanner = new Scanner(System.in);
        switch (selection) {
            case 1:
            	println("Enter a number.");
                num1 = scanner.nextDouble();
                Log.naturalLog(num1);
                CalcMenu.calculatorMenu();
                break;
            case 2:
            	println("Enter a number.");
                num1 = scanner.nextDouble();
                Log.logBaseTen(num1);
                CalcMenu.calculatorMenu();
                break;
            default:
                println("Invalid selection. Please try again.");
                Submenu.logMenu();
        }

    }

	private static void println(String string) {
		System.out.println(string);
	}
}