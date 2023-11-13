import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            int n = sc.nextInt();
            int min = 7977;
            int result = 0;
            
            if(n == 0) {
                break;
            }
            
            for(int i=1; i<=n; i++) {
                int num = sc.nextInt();
                
                if(num >= 2023) {
                    num -= 2023; 
                } else {
                    num = 2023 - num;
                }
                
                if(num < min) {
                    min = num;
                    result = i;
                }
            }
            
            System.out.println(result);
        }
    }
    
}