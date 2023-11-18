import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int x = 0;
        int y = 0;
        
        for(int i=0; i<n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            if(i != 0) {
                if(a >= x) {
                    sum += a-x;
                } else {
                    sum += x-a;
                }
                
                if(b >= y) {
                    sum += b-y;
                } else {
                    sum += y-b;
                }
            }
            
            x = a;
            y = b;
        }
        
        System.out.print(sum);
    }
    
}