import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            if(b < 45) {
                b += 15;
                a--;
            } else {
                b -= 45;
            }
            
            if(a < 0) {
                a += 24;
            }
            
            System.out.println("Case #"+(i+1)+": "+a+" "+b);
        }
    }
    
}