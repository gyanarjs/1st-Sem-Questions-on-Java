public class Q10 {
    public static boolean isPalindrome(String str) {
        int low = 0;
        int high = str.length() - 1;

        // Keep comparing characters while they are same
        while (low < high) {
            if (str.charAt(low) != str.charAt(high)) {
                return false; // not a palindrome.
            }
            low++; // move the low index forward
            high--; // move the high index backwards
        }
        return true; // is a palindrome
    }

    public static void main(String[] args) {
        String str = "MADAM";
        //String str1 = "abcded";

        System.out.println(str + " is palindrome " + isPalindrome(str));
        //System.out.println(str1 + " is palindrome " + isPalindrome(str1));
    }
}
