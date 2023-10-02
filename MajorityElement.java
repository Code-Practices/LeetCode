public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        //int[] nums = {3,2,3};
        int x = nums.length / 2 ;
        System.out.println("nums length is = "+ x);
        
        for (int i = 0; i < nums.length; i++) {
            int count =0;
           // System.out.println(nums[i]);
            for (int j = 0; j < nums.length; j++) {
                if(nums[i] == nums[j]){
                    count++;
                }
                
                
            }
           // System.out.printf("Count for nums %d is %d \n",nums[i],count);
            if(count > x){
                System.out.println(nums[i]);
                break;
                
            }
            
        }
    }
}
