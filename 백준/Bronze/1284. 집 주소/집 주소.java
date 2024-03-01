import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            int n = sc.nextInt();
            int sum = 0;
            int count = 0;
            
            if(n == 0) {
                break;
            }
            
            while(n > 0) {
                int num = n%10;
                
                if(num == 1) {
                    sum += 2;
                } else if(num == 0) {
                    sum += 4;
                } else {
                    sum += 3;
                }
                
                count++;
                n/=10;
            }
            
            int result = sum+2+(count-1);
            System.out.println(result);
        }
    }
    
}