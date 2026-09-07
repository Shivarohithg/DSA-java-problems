import java.util.Stack;

class Blancedparantheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            } 
            else {
                if (stack.isEmpty()) {
                    return false;
                } 
                else if ((s.charAt(i) == ']' && stack.peek() == '[') || 
                         (s.charAt(i) == '}' && stack.peek() == '{') || 
                         (s.charAt(i) == ')' && stack.peek() == '(')) {
                    stack.pop();
                } 
                else {
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }
}

public class Main {
    public static void main(String[] args) {
        Blancedparantheses solver = new Blancedparantheses();

        String test1 = "()[]{}";
        String test2 = "([)]";
        String test3 = "{[]}";
        String test4 = "]";

        System.out.println("Test 1: " + solver.isValid(test1));
        System.out.println("Test 2: " + solver.isValid(test2));
        System.out.println("Test 3: " + solver.isValid(test3));
        System.out.println("Test 4: " + solver.isValid(test4));
    }
}
