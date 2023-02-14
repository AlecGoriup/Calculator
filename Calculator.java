import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your first whole number.");
        int wholeNum1 = scan.nextInt();

        System.out.println("Please enter your second whole number.");
        int wholeNum2 = scan.nextInt();

        int result = wholeNum1 + wholeNum2;

        System.out.println("Added together: " + wholeNum1 + " + " + wholeNum2 + " = " + result + ".");
    }
}