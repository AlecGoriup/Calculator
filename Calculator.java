import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your first whole number.");
        int wholeNum1 = scan.nextInt();

        System.out.println("Please enter your second whole number.");
        int wholeNum2 = scan.nextInt();

        scan.nextLine(); // skip newLine char

        System.out.println(
                "Would you like to perform addition, subtraction, multiplication, or division with the two numbers");
        String choice = scan.nextLine();

        if (choice.equals("addition")) {
            int result = wholeNum1 + wholeNum2;

            System.out.println("Added together: " + wholeNum1 + " + " + wholeNum2 + " = " + result + ".");
        }

        if (choice.equals("subtraction")) {
            int result = wholeNum1 - wholeNum2;

            System.out.println("Subtracted together: " + wholeNum1 + " - " + wholeNum2 + " = " + result + ".");
        }

        if (choice.equals("multiplication")) {
            int result = wholeNum1 * wholeNum2;

            System.out.println("Multiplied together: " + wholeNum1 + " x " + wholeNum2 + " = " + result + ".");
        }

        if (choice.equals("division")) {
            int result = wholeNum1 / wholeNum2;

            System.out.println("Divided together: " + wholeNum1 + " / " + wholeNum2 + " = " + result + ".");
        }

    }
}