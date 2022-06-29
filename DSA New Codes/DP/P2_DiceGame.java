public class P2_DiceGame {
    static int countWays(int current, int end) {
        if(current == end) {
            return 1;
        }

        if(current > end) {
            return 0;
        }

        int count = 0;
        for(int dice = 1; dice <= 6; dice++) {
            count = count + countWays(current + dice, end);
        }
        return count;
    }

    static int countWaysMemoization(int current, int end, int []cache) {
        if(current == end) {
            return 1;
        }

        if(current > end) {
            return 0;
        }

        if(cache[current] != 0) {
            return cache[current];
        }

        int count = 0;
        for(int dice = 1; dice <= 6; dice++) {
            count = count + countWaysMemoization(current + dice, end, cache);
        }
        cache[current] = count;
        return count;
    }

    static int tabulation(int start, int end) {
        int cache[] = new int[end + 1];
        cache[end] = 1;
        for(int i = end - 1; i >= 0; i--) {
            int count = 0;
            for(int dice = 1; dice <= 6 && dice + i < cache.length; dice++) {
                count += cache[dice + i];
            }
            cache[i] = count;
        }

        for(int i = 0; i < cache.length; i++) {
            System.out.println(cache[i]);
        }

        return cache[start];
    }

    public static void main(String[] args) {
        int n = 10;
        long startTime = System.currentTimeMillis();
        int res = countWays(0, n);
        System.out.println("Result is : " + res);
        long end = System.currentTimeMillis();
        long total = end - startTime;
        System.out.println("Total time taken : " + total + " ms");

        System.out.println("==================================");

        startTime = System.currentTimeMillis();
        res = countWaysMemoization(0, n, new int[n+1]);
        System.out.println("Result is : " + res);
        end = System.currentTimeMillis();
        total = end - startTime;
        System.out.println("Total time taken : " + total + " ms");

        System.out.println("==================================");

        res = tabulation(0, n);
        System.out.println("Result is : " + res);

    }
}
