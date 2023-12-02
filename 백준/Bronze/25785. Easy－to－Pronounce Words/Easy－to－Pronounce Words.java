import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int strLength = str.length();
        
        for(int i=0; i<strLength-1; i++) {
            if((str.charAt(i) == 'a' ||
              str.charAt(i) == 'e' ||
              str.charAt(i) == 'i' ||
              str.charAt(i) == 'o' ||
              str.charAt(i) == 'u') && 
              (str.charAt(i+1) == 'a' ||
              str.charAt(i+1) == 'e' ||
              str.charAt(i+1) == 'i' ||
              str.charAt(i+1) == 'o' ||
              str.charAt(i+1) == 'u')) {
                System.out.print(0);
                return;
            }
            
            if(!(str.charAt(i) == 'a' ||
              str.charAt(i) == 'e' ||
              str.charAt(i) == 'i' ||
              str.charAt(i) == 'o' ||
              str.charAt(i) == 'u') && 
              !(str.charAt(i+1) == 'a' ||
              str.charAt(i+1) == 'e' ||
              str.charAt(i+1) == 'i' ||
              str.charAt(i+1) == 'o' ||
              str.charAt(i+1) == 'u')) {
                System.out.print(0);
                return;
            }
        }
        
        System.out.print(1);
    }
    
}