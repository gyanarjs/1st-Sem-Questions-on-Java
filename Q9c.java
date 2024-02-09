public class Q9c {

    public static double min(double[] array) {
        // Initialize minElement to the first element of the array
        double minElement = array[0];
        
        // Iterate through the array starting from the second element
        for (int i = 1; i < array.length; i++) {
            // If the current element is smaller than minElement, update minElement
            if (array[i] < minElement) {
                minElement = array[i];
            }
        }
        
        // Return the smallest element
        return minElement;
    }
    public static void main(String[] args) {
        double[] array = {10.5, 20.3, 5.7, 8.9, 15.2};
        double minElement = min(array);
        System.out.println("The smallest element in the array is: " + minElement);
    }

    
}