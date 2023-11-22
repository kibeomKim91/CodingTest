import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++) {
            int m = sc.nextInt();
            int k = sc.nextInt();
            int sum = 0;
            
            for(int j=0; j<m; j++) {
                int candy = sc.nextInt();
                sum += candy/k;
            }
            
            System.out.println(sum);
        }
    }
    
}