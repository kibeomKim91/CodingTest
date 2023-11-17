import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        while(true) {
            int m = n;
            int sum = 0;
            
            while(m > 0) {
                sum += m%10;
                m /= 10;
            }
            
            if(n%sum == 0) {
                System.out.print(n);
                break;
            } else {
                n++;
            }
        }
    }
    
}