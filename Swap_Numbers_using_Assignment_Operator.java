import java.util.Scanner;
public class Swap_Numbers_using_Assignment_Operator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Before swapping:");
        System.out.println("Num1 = " + num1);
        System.out.println("Num2 = " + num2);

        // Swap numbers using temporary variable
        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After swapping:");
        System.out.println("Num1 = " + num1);
        System.out.println("Num2 = " + num2);
    }

}
