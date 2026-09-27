import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter brackets: ");
        String s = sc.nextLine();

        Stack<Character> stack = new Stack<>();

        // Check every character
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // If opening bracket, push into stack
            if (ch == '(' || ch == '{' || ch == '[') {

                stack.push(ch);

            } 
            // If closing bracket
            else {

                // No opening bracket available
                if (stack.isEmpty()) {
                    System.out.println("Invalid");
                    return;
                }

                // Get the last opening bracket
                char top = stack.pop();

                // Check whether brackets match
                if (ch == ')' && top != '(') {
                    System.out.println("Invalid");
                    return;
                }

                if (ch == '}' && top != '{') {
                    System.out.println("Invalid");
                    return;
                }

                if (ch == ']' && top != '[') {
                    System.out.println("Invalid");
                    return;
                }
            }
        }

        // If stack is empty, all brackets were matched
        if (stack.isEmpty()) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }

        sc.close();
    }
}