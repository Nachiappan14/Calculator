package calculator;

import java.util.Scanner;

public class CalcMenu {

    public static String calculatorMenu() {

        Integer input;

        Scanner scanner = new Scanner(System.in);
        
        println(
                "\nWhat would you like to do? Input a number and press enter. \n" +
                        "1. Arithmetic \n" +
                        "2. Exponents \n" +
                        "3. Logarithms \n" +
                        "4. Exit \n");
        
        input = scanner.nextInt();

        switch (input) {
            case 1:
                Submenu.arithmeticMenu();
                break;
            case 2:
                Submenu.exponentMenu();
                break;
            case 3:
                Submenu.logMenu();
                break;
            case 4:
                println("Bye!");
                System.exit(0);
                break;
            default:
                println("\n Invalid selection. Please try again.");
                CalcMenu.calculatorMenu();
        }

        return null;
    }

	private static void println(String string) {
		System.out.println(string);
	}
}