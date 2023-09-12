public class HammingWeight {
    public static void main(String[] args) {
        
        long n = 4294967293L;
        int count = 0;
        Character ss = 1;
       
        if(n < 0){
            n = n*(-1);
        }else{
            n = n;
        }
    
        String binaryString = Long.toBinaryString(n);
        System.out.println(binaryString);
        
        for (int i = 0; i < binaryString.length(); i++) {
            
            if(binaryString.charAt(i) == '1')
            
                count++;
            }
            
            System.out.println(count);
        }

        
    
}
