public class P5_Knapsack {
    static int ks(int []wt, int val[], int capacity, int index) {
        // Base case, if bag is full
        if(index == wt.length || capacity == 0) {
            return 0;
        }

        if(wt[index] > capacity) {
            return ks(wt, val, capacity, index+1);
        }

        else {
            int opt_1 = val[index] + ks(wt, val, capacity - wt[index], index+1);
            int opt_2 = ks(wt, val, capacity, index+1);
            return Math.max(opt_1, opt_2);
        }
    }

    public static void main(String[] args) {
        int wt[] = {1,2,2};
        int val[] = {60,100,200};
        int capacity = 3;
        int result = ks(wt, val, capacity, 0);
        System.out.println("Result is : " + result);
    }
}
