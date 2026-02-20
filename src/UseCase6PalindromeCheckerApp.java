import java.util.*;

public class UseCase6PalindromeCheckerApp {

  public static void main(String[] args) {

    String word = "civic";

    Stack<Character> stack = new Stack<>();
    Queue<Character> queue = new LinkedList<>();

    for (char c : word.toCharArray()) {
      stack.push(c);
      queue.add(c);
    }

    boolean result = true;

    while (!stack.isEmpty()) {
      if (stack.pop() != queue.remove()) {
        result = false;
        break;
      }
    }

    if (result) {
      System.out.println(word + " is Palindrome");
    } else {
      System.out.println(word + " is Not Palindrome");
    }

  }
}