import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        
        int[] digits = new int[]{9,9,9,9};

        int number = 0;
        int pow = 1;

          for (int i = digits.length-1; i >= 0 ; i--) {
            number += digits[i]*pow;
            pow *= 10;
            
          }
        number ++;

        int[] answer = new int[number/pow > 0 ? digits.length + 1 : digits.length];
        
        

    }
  }

