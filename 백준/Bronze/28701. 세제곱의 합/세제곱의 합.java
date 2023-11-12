import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 0;
        
        for(int i=1; i<=n; i++) {
            a += i;
            b += i*i*i;
        }
        
        System.out.println(a);
        System.out.println(a*a);
        System.out.println(b);
    }
    
}