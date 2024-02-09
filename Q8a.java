public class Q8a {


    public static int sumOfDigit(int n) {
        // Continue looping until the number is greater than 9
        while (n > 9) {
            int sum = 0;
            // Calculate sum of digits
            while (n != 0) {
                sum += n % 10;
                n /= 10;
            }
            // Update n with the sum of digits
            n = sum;
        }
        return n;
    }
    public static void main(String[] args) {
        int n = 9294;
        int result = sumOfDigit(n);
        System.out.println("Result: " + result);
    }

    
}