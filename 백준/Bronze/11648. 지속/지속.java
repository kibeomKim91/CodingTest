import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        
        while(n>=10) {
            int copy = n;
            int num = 1;
            
            while(copy>0) {
                num *= copy%10;
                copy /= 10;
            }
            
            result++;
            n = num;
        }
        
        System.out.print(result);
    }
    
}