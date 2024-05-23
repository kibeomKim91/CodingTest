import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        
        for(int i=0; i<m; i++) {
            int n = sc.nextInt();
            int s = sc.nextInt();
            int max = 0;
            
            for(int j=0; j<n; j++) {
                int num = sc.nextInt();
                
                if(num > max) {
                    max = num;
                }
            }
            
            double d = max * s / 1000.0;
            int result = (int) d;            
            if(d > result) {
                result++;
            }
            
            System.out.println(result);
        }
    }
    
}