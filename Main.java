// Name: DEEPESH SRIVASTAVA
// PRN: 23070126028
// Batch: AIML A2

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        int choice;
        do {
            System.out.println("\n---- CALCULATOR MENU ----");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square");
            System.out.println("6. Cube");
            System.out.println("7. Square Root");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            
            choice = sc.nextInt();


            try {
                switch (choice) {
                    case 1:
                        calc.addition();
                        break;
                    case 2:
                        calc.subtraction();
                        break;
                    case 3:
                        calc.multiplication();
                        break;
                    case 4:
                        calc.division();
                        break;
                    case 5:
                        calc.square();
                        break;
                    case 6:
                        calc.cube();
                        break;
                    case 7:
                        calc.squareRoot();
                        break;
                    case 8:
                        System.out.println("Exiting Calculator...");
                        break;
                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            } catch (ArithmeticException e) {
                System.out.println("Math Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

        } while (choice != 8);

        sc.close();
    }
}

