import java.util.*;

public class UseCase1PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("UC1 - Welcome Message");
        System.out.println("Welcome to Palindrome Checker App");
        System.out.println("Version 1.0");
        System.out.println("System initialized successfully.");

        // UC2
        String word2 = "madam";
        System.out.println("UC2 - Word: " + word2);
        System.out.println("Palindrome: " + word2.equals("madam"));
        System.out.println("----------------------------------");

        // UC3
        String word3 = "racecar";
        String reversed = "";
        for (int i = word3.length() - 1; i >= 0; i--) {
            reversed += word3.charAt(i);
        }
        System.out.println("UC3 - Word: " + word3);
        System.out.println("Palindrome: " + word3.equals(reversed));
        System.out.println("----------------------------------");

        // UC4
        String word4 = "radar";
        char[] chars = word4.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        boolean resultArray = true;

        while (start < end) {
            if (chars[start] != chars[end]) {
                resultArray = false;
                break;
            }
            start++;
            end--;
        }
        System.out.println("UC4 - Word: " + word4);
        System.out.println("Palindrome: " + resultArray);
        System.out.println("----------------------------------");

        // UC5
        String word5 = "noon";
        Stack<Character> stack = new Stack<>();
        for (char c : word5.toCharArray()) {
            stack.push(c);
        }

        String stackReverse = "";
        while (!stack.isEmpty()) {
            stackReverse += stack.pop();
        }
        System.out.println("UC5 - Word: " + word5);
        System.out.println("Palindrome: " + word5.equals(stackReverse));
        System.out.println("----------------------------------");

        // UC6
        String word6 = "civic";
        Stack<Character> stack2 = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        for (char c : word6.toCharArray()) {
            stack2.push(c);
            queue.add(c);
        }

        boolean resultQS = true;
        while (!stack2.isEmpty()) {
            if (stack2.pop() != queue.remove()) {
                resultQS = false;
                break;
            }
        }
        System.out.println("UC6 - Word: " + word6);
        System.out.println("Palindrome: " + resultQS);
        System.out.println("----------------------------------");

        // UC7
        String word7 = "refer";
        Deque<Character> deque = new LinkedList<>();
        for (char c : word7.toCharArray()) {
            deque.addLast(c);
        }

        boolean resultDeque = true;
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                resultDeque = false;
                break;
            }
        }
        System.out.println("UC7 - Word: " + word7);
        System.out.println("Palindrome: " + resultDeque);
        System.out.println("----------------------------------");

        System.out.println("Program Finished");
    }
}