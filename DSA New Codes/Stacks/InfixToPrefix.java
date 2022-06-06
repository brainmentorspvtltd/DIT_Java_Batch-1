import java.util.Stack;

public class InfixToPrefix {

    /*
     * 1. scan the expression from left to right
     * 2. if the scanned character is operand then push in operand stack
     * 3. But if scanned character is operator, check priority
     *      - if priority is greater, then push in operator stack
     *      - else pop 2 operands from operand stack, pop operator from operator stack
     *      - and push string : op + b + a into operand stack
     * 4. if character is '(' then push it in stack
     * 5. if character is ')' then pop the stack and print it until '(' is encountered
     */

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

    static String infixToPrefix(String expression) {
        Stack<String> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();
        String result = "";

        for(int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if(c == '(') {
                operators.push(c);
            }
            else if(c == ')') {
                while(!operators.empty() && operators.peek() != '(') {
                    String operand_1 = operands.pop();
                    String operand_2 = operands.pop();
                    char opr = operators.pop();
                    String exp = opr + operand_2 + operand_1;
                    operands.push(exp);
                }
                operators.pop();    // will pop opening bracked
            }
            else if(Character.isLetterOrDigit(c)) {
                operands.push(c + "");
            }
            else {
                while(!operators.isEmpty() && precedence(c) <= precedence(operators.peek())){
                    String operand_1 = operands.pop();
                    String operand_2 = operands.pop();
                    char opr = operators.pop();
                    String exp = opr + operand_2 + operand_1;
                    operands.push(exp);
                }
                operators.push(c);
            }
        }

        while(!operators.empty()) {
            String operand_1 = operands.pop();
            String operand_2 = operands.pop();
            char opr = operators.pop();
            String exp = opr + operand_2 + operand_1;
            operands.push(exp);
        }
        result = operands.peek();
        return result;
    }

    public static void main(String[] args) {
        String expression = "a*b+c/d";
        System.out.println(infixToPrefix(expression));
    }
}
