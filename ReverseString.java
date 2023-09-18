
public class ReverseString {
    public static void main(String[] args) {
        String[] s = {"h","e","l","l","o","i"};
        
        
        
        for (int i = 0; i < s.length/2; i++) {

            String temp = s[i];
            s[i] = s[s.length -1 -i];
            s[s.length-1-i] = temp;
            
        }
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]);
        }
        System.out.println();
    }
}
