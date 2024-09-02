import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for(int i=0; i<t; i++) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int d = sc.nextInt();
            int sum = 0;
            
            for(int j=0; j<n; j++) {
                sum += a;
                a += d;
            }
            
            System.out.println(sum);
        }
    }
    
}