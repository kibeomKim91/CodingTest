import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int aa = 0;
        int b = 0;
        int bb = 0;
        
        for(int i=0; i<n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            
            a += y;
            b += z;
            
            if(y > z) {
                aa += x;
            } else if(z > y) {
                bb += x;
            }
        }
        
        if(a > b && aa > bb) {
            System.out.print(1);
        } else if(b > a && bb > aa) {
            System.out.print(2);
        } else {
            System.out.print(0);
        }
    }
    
}