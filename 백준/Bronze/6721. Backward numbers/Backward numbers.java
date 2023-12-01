import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++) {
            String a = sc.next();
            String b = sc.next();
            
            StringBuilder aa = new StringBuilder(a);
            StringBuilder bb = new StringBuilder(b);
            a = aa.reverse().toString();
            b = bb.reverse().toString();
            
            int sum = Integer.parseInt(a) + Integer.parseInt(b);
            String str = Integer.toString(sum);
            StringBuilder cc = new StringBuilder(str);
            String reverseStr = cc.reverse().toString();
            int result = Integer.parseInt(reverseStr);
            
            System.out.println(result);
        }
    }
    
}