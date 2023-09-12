public class DuplicationContains{

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        boolean result = true;

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


            if(count > 1) {
            System.out.println(result);
            break; }
            else{
                System.out.println(!result);
                break;
            }
            
        }
        
    }
}


