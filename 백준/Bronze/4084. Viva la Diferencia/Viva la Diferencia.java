import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int count  = 0;
            
            if(a == 0 && b == 0 && c == 0 && d == 0) {
                break;
            }
            
            while(true) {
                if(a == b && b == c && c == d) {
                    break;
                }
                
                int w = Math.abs(a-b);
                int x = Math.abs(b-c);
                int y = Math.abs(c-d);
                int z = Math.abs(d-a);
                
                a = w;
                b = x;
                c = y;
                d = z;
                count++;
            }
            
            System.out.println(count);
        }
    }
    
}