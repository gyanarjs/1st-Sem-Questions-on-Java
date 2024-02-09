public class Q8b {

    public static boolean checkNeon(int n) {
        // Square the number
        int square = n * n;
        
        // Calculate the sum of digits of the square
        int sumOfDigits = 0;
        while (square != 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }
        
        // Check if the sum of digits equals the original number
        return sumOfDigits == n;
    }
    public static void main(String[] args) {
        int n = 9;
        boolean result = checkNeon(n);
        System.out.println("Is " + n + " a Neon number? " + result);
    }

    
}