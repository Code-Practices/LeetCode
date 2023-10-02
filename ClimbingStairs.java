public class ClimbingStairs {
    public static void main(String[] args) {

        int n = 5; // The target number to reach

        int ways = countWays(n);
        System.out.println("Number of ways to get " + n + " using 1s and 2s: " + ways);

        
    }
    public static int countWays(int n) {
        if (n <= 1) {
            return 1; // Only one way to make 0 or 1 using 1s and 2s (no operation or using 1 once)
        }

        // Use recursion to count the ways
        int ways1 = countWays(n - 1); // Subtract 1 from n
        int ways2 = countWays(n - 2); // Subtract 2 from n

        return ways1 + ways2;
    }


    
}
