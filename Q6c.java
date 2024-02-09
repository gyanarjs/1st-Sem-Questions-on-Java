import java.util.Arrays;

public class Q6c {
    public static void main(String[] args) {
        int[] A = {20, 40, 30, 50, 40, 20};
        int N = A.length;

        // Sort the array to group fruits with the same weight together
        Arrays.sort(A);

        // Count the number of distinct weights
        int steps = 1;
        for (int i = 1; i < N; i++) {
            if (A[i] != A[i - 1]) {
                steps++;
            }
        }

        // Print the number of steps
        System.out.println("Number of steps to slice all fruits: " + steps);
    }
}