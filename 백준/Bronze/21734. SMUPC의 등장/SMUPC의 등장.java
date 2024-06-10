import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int strLength = str.length();
        
        for(int i=0; i<strLength; i++) {
            int num = (int) str.charAt(i);
            int n = 0;
            String result = "";
            
            while(num>0) {
                n += num%10;
                num /= 10;
            }
            
            for(int j=0; j<n; j++) {
                result += str.charAt(i);
            }
            
            System.out.println(result);
        }
    }
    
}