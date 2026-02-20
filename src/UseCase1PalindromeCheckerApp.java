public class UseCase1PalindromeCheckerApp {

    public static void main(String[] args) {

        String appName = "Palindrome Checker App";
        String version = "Version 1.0";


        System.out.println("Welcome to " + appName);
        System.out.println(version);
        System.out.println("Application initialized successfully.");
        String word = "madam";
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        if (word.equals(reversed)) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }

        System.out.println("Application execution completed.");
    }
}