import java.util.Stack;

public class InfixToPostfix {
    /*
     * 1. scan the expression from left to right
     * 2. if the scanned character is operand then print it
     * 3. But if scanned character is operator
     * 4. then we follow BODMAS
     *    if character is '(' then push it in stack
     *    if character is ')' then pop the stack and print it until '(' is encountered
     *    In between we keep on checking operators precedence
     *    '^' operator is right associative and '+', '-', '/', '*' are left associative
     */

     // higher returned value means higher precedence
     static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            
            case '^':
                return 3;
        }
        return -1;
     }

     static String infixToPostfix(String exp) {
        String result = new String("");

        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            // If the character is letter
            if(Character.isLetterOrDigit(c)) {
                result += c;
            }
            // If character is '(', push it in stack
            else if(c == '(') {
                stack.push(c);
            }
            // If character is ')', pop and output from the stack until '(' is encountered
            else if(c == ')') {
                while(!stack.isEmpty() && stack.peek() != '(') {
                    result += stack.pop();
                }
                if(!stack.isEmpty() && stack.peek() != '(') {
                    return "Invalid Expression";
                }
                else {
                    stack.pop();
                }
            }
            // If character is an operator
            else {
                while(!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    if(stack.peek() == '(') {
                        return "Invalid Expression";
                    }
                    result += stack.pop();
                }
                stack.push(c);
            }
         }

         while(!stack.isEmpty()) {
             if(stack.peek() == '(') {
                 return "Invalid Expression";
             }
             result += stack.pop();
         }

         return result;
     }

     public static void main(String[] args) {
        String expression = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println(infixToPostfix(expression));
     }

}
