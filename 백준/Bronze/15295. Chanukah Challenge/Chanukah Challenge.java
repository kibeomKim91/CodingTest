import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = 0;
            
            for(int j=1; j<=b; j++) {
                sum += j;
            }
            
            sum += b;
            System.out.println(a+" "+sum);
        }
    }
    
}