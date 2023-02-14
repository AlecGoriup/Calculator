import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your first number.");
        float wholeNum1 = scan.nextFloat();

        System.out.println("Please enter your second number.");
        float wholeNum2 = scan.nextFloat();

        scan.nextLine(); // skip newLine char

        System.out.println(
                "Would you like to perform addition, subtraction, multiplication, or division with the two numbers");
        String choice = scan.nextLine();

        if (choice.equals("addition")) {
            float result = wholeNum1 + wholeNum2;

            System.out.println("Added together: " + wholeNum1 + " + " + wholeNum2 + " = " + result + ".");
        }

        if (choice.equals("subtraction")) {
            float result = wholeNum1 - wholeNum2;

            System.out.println("Subtracted together: " + wholeNum1 + " - " + wholeNum2 + " = " + result + ".");
        }

        if (choice.equals("multiplication")) {
            float result = wholeNum1 * wholeNum2;

            System.out.println("Multiplied together: " + wholeNum1 + " x " + wholeNum2 + " = " + result + ".");
        }

        if (choice.equals("division")) {
            if (wholeNum2 == 0) {
                System.out.println("Error: Divide by Zero");
            }

            else {
                float result = wholeNum1 / wholeNum2;

                System.out.println("Divided together: " + wholeNum1 + " / " + wholeNum2 + " = " + result + ".");
            }
        }

    }
}