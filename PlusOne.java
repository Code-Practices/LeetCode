import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
       int[] digits = new int[]{9,8,7,6,5,4,3,0,0};
       System.out.println(Arrays.toString(plusOne(digits))); 

    }

    public static int[] plusOne(int[] digits){
       // create int array including digits and name it as digits
        

        int number = 0;
        int pow = 1;
        // take each digits from digit and create integer number
          for (int i = digits.length-1; i >= 0 ; i--) {
            number += digits[i]*pow;
            pow *= 10;
            
          }
        number ++; // +1 
          // create new int array. After add 1 length of the integer took as new answer array length
        int[] answer = new int[number/pow > 0 ? digits.length + 1 : digits.length];
        if(answer.length == digits.length) pow/=10;
        for(int j = 0; j < answer.length; j++){
          answer[j] = number/pow;
          number %= pow;
          pow /= 10;
        }

        return answer;
      
    }
  }

