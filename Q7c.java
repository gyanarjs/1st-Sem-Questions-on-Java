public class Q7c {
    public static void main(String[] args) {
        int n = 5;

        // Outer loop for rows
        for (int i = n; i >= 0; i--) {
            // Inner loop for printing numbers
            for (int j = 0; j <= n - i; j++) {
                System.out.print(i + " ");
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }
}