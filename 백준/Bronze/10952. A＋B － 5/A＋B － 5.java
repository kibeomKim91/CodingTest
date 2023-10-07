import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        boolean bool = true;
        
        while(bool) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            
            if(A == 0 && B == 0) {
                bool = false;
                break;
            }
            
            System.out.println(A+B);
        }
    }
    
}