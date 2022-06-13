import java.util.ArrayList;

public class P17_DiceProblem {
    static ArrayList<String> dicePossibilities(int currentValue, int endValue) {
        if(currentValue == endValue) {
            ArrayList<String> t = new ArrayList<>();
            t.add("");
            return t;
        }
        if(currentValue > endValue) {
            ArrayList<String> t = new ArrayList<>();
            return t;
        }

        ArrayList<String> result = new ArrayList<>();
        for(int dice = 1; dice <= 6; dice++) {
            int newValue = currentValue + dice;
            ArrayList<String> temp = dicePossibilities(newValue, endValue);
            for(String s : temp) {
                result.add(dice + s);
            }
        }
        return  result;
    }

    public static void main(String[] args) {
        System.out.println(dicePossibilities(0, 6));
    }
}
