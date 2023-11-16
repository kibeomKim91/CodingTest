import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        double d = Math.sqrt(a*a+b*b);
        
        for(int i=0; i<n; i++) {
            int x = sc.nextInt();
            
            if(d >= x) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
    
}