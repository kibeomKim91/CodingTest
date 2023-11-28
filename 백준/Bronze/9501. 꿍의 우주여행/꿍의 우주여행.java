import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for(int i=0; i<t; i++) {
            int n = sc.nextInt();
            int d = sc.nextInt();
            int count = 0;
            
            for(int j=0; j<n; j++) {
                int v = sc.nextInt();
                int f = sc.nextInt();
                int c = sc.nextInt();
                
                if((double) v/c*f >= d) {
                    count++;
                }
            }
            
            System.out.println(count);
        }
    }
    
}