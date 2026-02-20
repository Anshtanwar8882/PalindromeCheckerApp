public class UseCase4PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "radar";
        char[] chars = word.toCharArray();

        int start = 0;
        int end = chars.length - 1;
        boolean result = true;

        while (start < end) {
            if (chars[start] != chars[end]) {
                result = false;
                break;
            }
            start++;
            end--;
        }

        if (result) {
            System.out.println(word + " is Palindrome");
        } else {
            System.out.println(word + " is Not Palindrome");
        }

    }
}