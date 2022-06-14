public class P19_CoinChangeProblem {
    static void coinChange(int denomination[], int amount, String result, int lastIndex) {
        if(amount == 0) {
            System.out.println(result);
            return;
        }
        for(int i = lastIndex; i < denomination.length; i++) {
            if(amount >= denomination[i]) {
                coinChange(denomination, amount-denomination[i], result + denomination[i], i);
            }
        }
    }
    public static void main(String[] args) {
        int d[] = {2,3,5,6};
        int amount = 10;
        coinChange(d, amount, "", 0);
    }
}
