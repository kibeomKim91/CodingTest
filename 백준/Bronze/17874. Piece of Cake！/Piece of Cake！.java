import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int v = 0;
        int h = 0;
        int l = 4;
        
        if(a >= n-a) {
            v = a;
        } else {
            v = n-a;
        }
        
        if(b >= n-b) {
            h = b;
        } else {
            h = n-b;
        }
        
        System.out.print(v * h * l);
    }
    
}