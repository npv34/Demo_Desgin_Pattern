package src.Proxy;

import src.Entity.Calculator;

public class CalculatorProxy {
    public int add(int num1, int num2) {
        Calculator calculator = new Calculator();
        return calculator.add(num1, num2);
    }
}
