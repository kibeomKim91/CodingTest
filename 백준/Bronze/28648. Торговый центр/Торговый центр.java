import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        
        for(int i=0; i<n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            if(result > a+b) {
                result = a+b;
            } else if(result == 0) {
                result = a+b;
            }
        }
        
        System.out.print(result);
    }
    
}