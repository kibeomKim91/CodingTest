import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++) {
            int m = sc.nextInt();
            int a = 0;
            int b = 0;
            int c = 0;
            
            for(int j=1; j<=m; j++) {
                a += j;
                b += 1+2*(j-1);
                c += j*2;
            }
            
            System.out.println(a+" "+b+" "+c);
        }
    }
    
}