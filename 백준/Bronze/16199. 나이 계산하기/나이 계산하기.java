import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        
        int n = 0;
        int m = 0;
        int o = 0;
        
        if(a == x) {
            m = 1;
        } else if(a < x) {
            m = 1 + x - a;
        }
        
        if(x-a >= 1) {
            if((b <= y && c <= z) || b < y) {
                n = m - 1;
            } else {
                n = m - 2;
            }
        } else {
            n = 0;
        }
        
        o = x - a;
        
        System.out.println(n);
        System.out.println(m);
        System.out.println(o);
    }
    
}