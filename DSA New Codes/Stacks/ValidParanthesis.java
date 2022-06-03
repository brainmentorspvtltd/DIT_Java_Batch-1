import java.util.HashMap;

public class ValidParanthesis {

    public static boolean isValid(String s) {
        GenStack<Character> stack = new GenStack<>(s.length());
        HashMap<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        for(int i = 0; i < s.length(); i++) {
            if((s.charAt(i) == ']' || s.charAt(i) == ')' || s.charAt(i) == '}') && stack.isEmpty()) {
                return false;
            }
            
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            }
            else {
                // return latest opening bracket
                Character currentBracket = stack.pop();
                // return closing bracket corresponding to opening bracket  
                currentBracket = map.get(currentBracket);
                if(currentBracket != s.charAt(i)) {
                    System.out.println("Invalid Bracket...");
                    return false;
                }
            }
        }

        if(stack.isEmpty()) {
            System.out.println("Valid Brackets...");
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        isValid("[][][]");
    }
    
}
