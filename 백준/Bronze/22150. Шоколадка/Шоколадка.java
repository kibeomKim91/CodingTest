import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for(int i=0; i<t; i++) {
            int n = sc.nextInt();
            int count = 0;
            
            for(int j=0; j<n; j++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                
                if(a+b < n) {
                    count++;
                }
            }
            
            if(count > 0) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
    
}