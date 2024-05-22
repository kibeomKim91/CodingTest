import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int aLength = a.length();
        int bLength = b.length();
        String result = "";
        
        int resultLength = Integer.min(aLength, bLength);
        for(int i=0; i<resultLength; i++) {
            if(i%2 == 0) {
                result += a.charAt(i);
            } else {
                result += b.charAt(i);
            }
        }
        
        System.out.print(result);
    }
    
}