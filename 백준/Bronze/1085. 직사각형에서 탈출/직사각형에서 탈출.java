import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        int result = 0;
        
        if(w-x < x) {
            x = w-x;
        }
        
        if(h-y < y) {
            y = h-y;
        }
        
        if(x<=y) {
            result = x;
        } else {
            result = y;
        }
        
        System.out.print(result);
    }
    
}