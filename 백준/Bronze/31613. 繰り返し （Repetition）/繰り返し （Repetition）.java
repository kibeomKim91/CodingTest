import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int count = 0;
        
        while(x<n) {
            int r = x%3;
            
            if(r==0) {
                x += 1;
            } else if(r==1) {
                x *= 2;
            } else {
                x *= 3;
            }
            
            count++;
        }
        
        System.out.print(count);
    }
    
}