public class DuplicationContains{

    public static void main(String[] args) {
        int[] nums = {1,1,1,3,3,4,3,2,4,2};

        loop:
        for(int i = 0; i<nums.length; i++ ){
            int x = nums[i];

            int count = 0;
            for(int j = 0; j < nums.length; j++){
                if(x == nums[j]){
                    if(j < i)continue loop;
                         count++;                   
                    
                }

            }
            System.out.println(count);
            if(count > 1) break; 
            
        }
        
    }
}


