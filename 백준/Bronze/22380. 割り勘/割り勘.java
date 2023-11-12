import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int sum = 0;
            
            if(n == 0 && m == 0) {
                break;
            }
            
            for(int i=0; i<n; i++) {
                int money = sc.nextInt();
                
                if(money >= m/n) {
                    sum += m/n;
                } else {
                    sum += money;
                }
            }
            
            System.out.println(sum);
        }
    }
    
}