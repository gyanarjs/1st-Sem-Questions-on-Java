public class Q9b {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int element = 30;
        boolean result = linearSearch(array, element);
        System.out.println("Is " + element + " present in the array? " + result);
    }

    public static boolean linearSearch(int[] array, int element) {
        // Iterate through the array
        for (int i = 0; i < array.length; i++) {
            // If the current element matches the search element, return true
            if (array[i] == element) {
                return true;
            }
        }
        // If the element is not found after iterating through the entire array, return false
        return false;
    }
}