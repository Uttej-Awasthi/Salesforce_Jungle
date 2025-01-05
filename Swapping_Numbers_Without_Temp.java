public class Swapping_Numbers_Without_Temp {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        System.out.println("Before swap:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // Swap without temp variable
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("After swap:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }

}
