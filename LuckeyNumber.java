import java.util.HashSet;
import java.util.Set;

public class LuckeyNumber {
    public static void main(String[] args) {
        Solution result = new Solution();
       System.out.println(result.isHappy(19));
        
        
        // int z = 0;
        // boolean result;
        // if(n == 1){
        //     result  =false;

        // }else{
        //     int x = 0;
            
        //     do{
        //         int y = 0;
        //         do{

        //             x = n%10;
        //             System.out.println(x);
        //             y+= x*x;
        //             n = n-x;
        //             n = n/10;
        //         }
        //         while(n%10 != 0);

        //         System.out.println(y);
        //         n = y;
        //          String ss = n+"";
        //         int tenpow = 10;
        //         for(int j = 1; j<ss.length()-1;j++){
        //             tenpow *= 10;  
        //         }
        //         z = tenpow;
        //         System.out.println(z);
        //         if(y/z == 1){
        //             result = true;
                    
        //         }else{
        //             result = false;
        //             break;
        //         }
               
        //     }while(n%10 !=0);

        
        // }
        // System.out.println(result);


        
    }
}

class Solution {
  public boolean isHappy(int n) {
    Set<Integer> inLoop = new HashSet<Integer>(); // using sets
    int squareSum,remain;
	while (inLoop.add(n)) {
		squareSum = 0;
		while (n > 0) {
		    remain = n%10;
			squareSum += remain*remain;
			n /= 10;
		}
		if (squareSum == 1)
			return true;
		else
			n = squareSum;

	}
	return false;

    }
}
