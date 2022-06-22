import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LetterCombinations {
    static String keyPadKeys[] = {"","+@$","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    // static Map<String, ArrayList<String>> keyPadKeys = new HashMap<>();

    static ArrayList<String> keypad(String number) {
        if(number.length() == 0){
            ArrayList<String> str = new ArrayList<>();
            str.add("");
            return str;
        }
        char firstChar = number.charAt(0);
        String remainingString = number.substring(1);
        // '2' -> 2
        int index = firstChar - '0';
        String keyPadKey = keyPadKeys[index];
        ArrayList<String> result = new ArrayList<>();
        for(int i = 0; i < keyPadKey.length(); i++) {
            ArrayList<String> temp = keypad(remainingString);
            for(String s : temp) {
                result.add(keyPadKey.charAt(i) + s);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // keyPadKeys.put("2", "abc");
        System.out.println(keypad("23"));
    }
}
