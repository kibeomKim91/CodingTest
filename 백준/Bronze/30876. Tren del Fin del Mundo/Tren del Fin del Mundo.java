import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int xResult = 0;
        int yResult = 0;
        
        for(int i=0; i<n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            if(i == 0) {
                xResult = x;
                yResult = y;
            } else if(i > 0 && yResult > y) {
                xResult = x;
                yResult = y;
            }
        }
        
        System.out.print(xResult+" "+yResult);
    }
    
}