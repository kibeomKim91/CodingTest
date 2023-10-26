import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            if(a <= 1 && b <= 2) {
                System.out.println("Yes");
            } else if(b <= 1 && a <= 2) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
    
}