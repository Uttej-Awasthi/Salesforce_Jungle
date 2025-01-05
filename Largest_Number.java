import java.util.Scanner;
public class Largest_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of values: ");
        int n = scanner.nextInt();

        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            int num = scanner.nextInt();
            if (num > largest) {
                largest = num;
            }
        }
        scanner.close();

        System.out.println("The largest number is: " + largest);
}
}
