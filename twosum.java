public class twosum{
    public static void main(String[] args) {
        
    }
    int k = 0;
    int l = 0;
   
    public int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];
        for(int i=0; i < nums.length; i++){
            int x = nums[i];
            
            for(int j=1; j<nums.length; j++){
                int y = nums[j];
                if(target == x + y){
                    k =i;
                    l = j;
                    result[0]=i;
                    result[1]=j;
                    break;
                }
            }

        }

        return result;    
    } 
}