public class Q6a {
    public static void main(String[] args) {
        String str = "hello";
        char ch = 'l';
        int occurrences = count(str, ch);
        System.out.println("Number of occurrences of '" + ch + "' in '" + str + "': " + occurrences);
    }

    public static int count(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
}