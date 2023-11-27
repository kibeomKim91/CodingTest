import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int beforeLength = 1;
        
        for(int i=0; i<n; i++) {
            String str = sc.next();
            int strLength = str.length();
            
            if(strLength < beforeLength) {
                System.out.print(" ");
            } else {
                System.out.print(str.charAt(beforeLength-1));                
            }
            
            beforeLength = strLength;
        }
    }
    
}