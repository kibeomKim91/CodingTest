import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        
        while(n>1) {
            if(n%2 == 1) {
                System.out.print(count+" ");
            }
            
            n /= 2;
            count++;
        }
        
         System.out.print(count);
    }
    
}