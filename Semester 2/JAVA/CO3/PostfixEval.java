import java.util.*;

public class PostfixEval {
    public static void main(String[] args) {
        String expr = "23*54*+9-";
        Stack<Integer> stack = new Stack<>();

        for(char c : expr.toCharArray()) {
            if(Character.isDigit(c))
                stack.push(c - '0');
            else {
                int b = stack.pop();
                int a = stack.pop();

                switch(c){
                    case '+': stack.push(a + b); break;
                    case '-': stack.push(a - b); break;
                    case '*': stack.push(a * b); break;
                    case '/': stack.push(a / b); break;
                }
            }
        }

        System.out.println("Result: " + stack.pop());
    }
}
