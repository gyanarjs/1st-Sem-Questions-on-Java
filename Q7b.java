import java.util.Scanner;

public class Q7b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the first number
        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        // Input the second number
        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        System.out.println("Prime numbers between " + firstNumber + " and " + secondNumber + ":");

        // Iterate through the range of numbers
        for (int i = firstNumber; i <= secondNumber; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}