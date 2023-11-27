import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            
            if(a == 0 && b == 0 && c == 0 && d == 0) {
                break;
            }
            
            int x = Math.min(c,d) - Math.max(a,b);
            int y = Math.max(c,d) - Math.min(a,b);
            
            System.out.println(x+" "+y);
        }
    }
    
}