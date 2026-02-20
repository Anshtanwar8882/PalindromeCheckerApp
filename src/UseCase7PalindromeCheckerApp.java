import java.util.*;

public class UseCase7PalindromeCheckerApp {

  public static void main(String[] args) {

    String word = "refer";

    Deque<Character> deque = new LinkedList<>();

    for (char c : word.toCharArray()) {
      deque.addLast(c);
    }

    boolean result = true;

    while (deque.size() > 1) {
      if (deque.removeFirst() != deque.removeLast()) {
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