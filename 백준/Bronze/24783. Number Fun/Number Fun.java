import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            
            if(a+b == c || a-b == c || b-a == c || a*b == c || (a/b == c && a%b == 0) || (b/a == c && b%a == 0)) {
                System.out.println("Possible");
            } else {
                System.out.println("Impossible");
            }
        }
    }
    
}