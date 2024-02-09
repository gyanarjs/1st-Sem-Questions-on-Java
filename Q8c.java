public class Q8c {

    public static boolean checkSpy(int n) {
        int sum = 0;
        int product = 1;

        // Loop through each digit of the number
        while (n != 0) {
            int digit = n % 10; // Extract the last digit
            sum += digit; // Add the digit to the sum
            product *= digit; // Multiply the digit to the product
            n /= 10; // Move to the next digit
        }

        // Check if sum equals product
        return sum == product;
    }
    public static void main(String[] args) {
        int n = 132;
        boolean result = checkSpy(n);
        System.out.println("Is " + n + " a Spy number? " + result);
    }

    
}