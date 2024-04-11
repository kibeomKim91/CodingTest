import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            if(x == 0 && y == 0) {
                break;
            }
            
            int a = x*30+y*40;
            int b = x*35+y*30;
            int c = x*40+y*20;
            
            int result = Math.min(a,Math.min(b,c));
            System.out.println(result);
        }
    }
    
}