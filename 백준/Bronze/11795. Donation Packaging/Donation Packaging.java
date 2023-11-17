import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;
        
        for(int i=0; i<n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            a += x;
            b += y;
            c += z;
            int min = Math.min(Math.min(a, b), c);
            
            if(min < 30) {
                System.out.println("NO");
            } else {
                System.out.println(min);
                a -= min;
                b -= min;
                c -= min;
            }
        }
    }
    
}