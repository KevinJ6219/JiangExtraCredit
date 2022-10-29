import java.util.Scanner;

public class CalculatorRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        String expression = "";
        double num1, num2;
        String operation;

        //Asking user for a expression
        System.out.print("Enter an expression with *, /, +, -, %, or ^: ");
        expression = input.nextLine();

        //Parsing out the numbers and the operation
        int length = expression.length() - 1;
        int indexOfSpace = expression.indexOf(" ");
        num1 = Integer.parseInt(expression.substring(0,indexOfSpace));
        num2 = Integer.parseInt(expression.substring(indexOfSpace + 3));
        operation = expression.substring(indexOfSpace + 1, indexOfSpace + 2);

        //Using the parsed out numbers and operations, put them in the parameters of an instance of the Calculator class
        Calculator expression1 = new Calculator(num1, num2, operation);

        //Prints out the calculation. If the user enters a operation that is not valid the system will tell the user.
        if (expression1.calculate() == -1) {
            System.out.println("There is no such operation.");
        }
        else {
            System.out.println(expression1.calculate());
        }
    }
}
