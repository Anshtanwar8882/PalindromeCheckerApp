import java.util.Stack;

public class UseCase5PalindromeCheckerApp {

  public static void main(String[] args) {

    String word = "noon";
    Stack<Character> stack = new Stack<>();

    for (char c : word.toCharArray()) {
      stack.push(c);
    }

    String reversed = "";

    while (!stack.isEmpty()) {
      reversed += stack.pop();
    }

    if (word.equals(reversed)) {
      System.out.println(word + " is Palindrome");
    } else {
      System.out.println(word + " is Not Palindrome");
    }

  }
}