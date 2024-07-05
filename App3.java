import src.Entity.Calculator;
import src.Facade.CalculatorFace;
import src.Facade.FacadeMenu;

import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        FacadeMenu menu = new FacadeMenu();
        menu.displayMenu();

        Scanner scanner = new Scanner(System.in);

        System.out.println("1: Add");
        System.out.println("2: Subtract");
        System.out.println("3: Multiply");
        System.out.println("4: Divide");
        int choice = scanner.nextInt();
        System.out.print("Enter first number: ");
        int num1 = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter second number: ");
        int num2 = Integer.parseInt(scanner.nextLine());

        CalculatorFace calculatorFace = new CalculatorFace();
        calculatorFace.calculate(num1, num2, choice);

    }
}
