import java.util.Scanner;

public class Calculator {
    Scanner sc = new Scanner(System.in);
    Operations op = new Operations();

    // Performs addition
    public void addition() {
        System.out.print("Enter two numbers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Result = " + op.add(a, b));
    }

    // Performs subtraction
    public void subtraction() {
        System.out.print("Enter two numbers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Result = " + op.subtract(a, b));
    }

    // Performs multiplication
    public void multiplication() {
        System.out.print("Enter two numbers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Result = " + op.multiply(a, b));
    }

    // Performs division
    public void division() {
        System.out.print("Enter numerator and denominator: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        if (b == 0) throw new ArithmeticException("Division by zero not allowed.");
        System.out.println("Result = " + op.divide(a, b));
    }

    // Finds square
    public void square() {
        System.out.print("Enter a number: ");
        double a = sc.nextDouble();
        System.out.println("Square = " + op.square(a));
    }

    // Finds cube
    public void cube() {
        System.out.print("Enter a number: ");
        double a = sc.nextDouble();
        System.out.println("Cube = " + op.cube(a));
    }

    // Finds square root
    public void squareRoot() {
        System.out.print("Enter a number: ");
        double a = sc.nextDouble();
        if (a < 0) throw new ArithmeticException("Cannot find square root of negative number.");
        System.out.println("Square Root = " + op.squareRoot(a));
    }
}
