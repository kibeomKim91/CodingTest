import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            int n = sc.nextInt();   
            if(n == 0) {
                break;
            }
            
            System.out.print(n);
            
            while(n >= 10) {
                int num = 1;
                
                while(n > 0) {
                    num *= n%10;
                    n /= 10;
                }
                
                System.out.print(" "+num);
                n = num;
            }
            
            System.out.println();
        }
    }
    
}