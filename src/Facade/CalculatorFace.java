package src.Facade;

import src.Entity.Calculator;

public class CalculatorFace {
    public void calculate(int num1, int num2, int operation) {
        Calculator calculator = new Calculator();
        switch (operation) {
            case 1:
                System.out.println("Result: " + calculator.add(num1, num2));
                break;
            case 2:
                System.out.println("Result: " + calculator.subtract(num1, num2));
                break;
            case 3:
                System.out.println("Result: " + calculator.multiply(num1, num2));
                break;
            case 4:
                System.out.println("Result: " + calculator.divide(num1, num2));
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
