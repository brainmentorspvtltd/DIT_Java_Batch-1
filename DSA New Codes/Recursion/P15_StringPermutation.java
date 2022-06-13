import java.util.ArrayList;

public class P15_StringPermutation {
    static ArrayList<String> permutation(String str) {
        if(str.length() == 0) {
            ArrayList<String> emptyString = new ArrayList<>();
            emptyString.add("");
            return emptyString;
        }
        char currentChar = str.charAt(0);
        String remString = str.substring(1);
        ArrayList<String> temp = permutation(remString);
        // Above is the small problem
        ArrayList<String> result = new ArrayList<>();
        for(String s : temp) {
            for(int i = 0; i <= s.length(); i++) {
                StringBuffer sb = new StringBuffer(s);
                sb.insert(i, currentChar);
                result.add(sb.toString());
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "abc";
        System.out.println(permutation(str));
    }

}
