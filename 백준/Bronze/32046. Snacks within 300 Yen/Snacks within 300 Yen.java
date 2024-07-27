import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            int n = sc.nextInt();
            int sum = 0;
            if(n == 0) {
                break;
            }
            
            for(int i=0; i<n; i++) {
                int num = sc.nextInt();
                if(sum+num <= 300) {
                    sum += num;
                }
            }
            
            System.out.println(sum);
        }
    }
    
}