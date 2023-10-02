public class ClimbingStairs {
    public static void main(String[] args) {

        int n = 45; // The target number to reach

        if(n==1) System.out.println("1");
        
        if(n==2) System.out.println("2");

        int[] a =  new int[n];
        a[0]=1;
        a[1]=2;

        for(int i=2;i<n;i++){
            a[i]=a[i-1]+a[i-2];
        }
        System.out.println(a[n-1]); 

        // int ways = countWays(n);
        // System.out.println("Number of ways to get " + n + " using 1s and 2s: " + ways);

        
    }
    /* public static int countWays(int n) {
        if (n <= 1) {
            return 1; // Only one way to make 0 or 1 using 1s and 2s (no operation or using 1 once)
        }

        // Use recursion to count the ways
        int ways1 = countWays(n - 1); // Subtract 1 from n
        int ways2 = countWays(n - 2); // Subtract 2 from n

        return ways1 + ways2;
    } */
    
}
