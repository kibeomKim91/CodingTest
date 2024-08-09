import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for(int i=0; i<t; i++) {
            int n = sc.nextInt();
            int sum = 0;
            
            for(int j=1; j<=n; j++) {
                sum += j*((j+1)*(j+2)/2);
            }
            
            System.out.println(sum);
        }
    }
    
}