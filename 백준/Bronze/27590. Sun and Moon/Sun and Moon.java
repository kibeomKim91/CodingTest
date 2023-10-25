import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int year = 0;
        int x = b - a;
        int y = d - c;
        
        for(int i=0; i<5000; i++) {
            if(x == 0) {
                x = b;
            }
            
            if(y == 0) {
                y = d;
            }
            
            year++;
            x--;
            y--;
            
            if(x == 0 && y == 0) {
                break;
            }
        }
        
        System.out.print(year);
    }
    
}