import java.util.Scanner;

public class CalculatorRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String expression = "";
        double num1, num2;
        String operation;
        System.out.print("Enter an expression with *, /, +, -, %, or ^: ");
        expression = input.nextLine();

        int length = expression.length() - 1;
        int indexOfSpace = expression.indexOf(" ");
        num1 = Integer.parseInt(expression.substring(0,indexOfSpace));
        num2 = Integer.parseInt(expression.substring(indexOfSpace + 3));
        operation = expression.substring(indexOfSpace + 1, indexOfSpace + 2);

        Calculator expression1 = new Calculator(num1, num2, operation);
        if (expression1.calculate() == -1) {
            System.out.println("There is no such operation.");
        }
        else {
            System.out.println(expression1.calculate());
        }
    }
}
