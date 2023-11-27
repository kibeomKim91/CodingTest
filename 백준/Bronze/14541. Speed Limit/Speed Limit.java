import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            int n = sc.nextInt();
            
            if(n == -1) {
                break;
            }
            
            int miles = 0;
            int time = 0;
            for(int i=0; i<n; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                
                miles += a*(b-time);                
                time = b;
            }
            
            System.out.println(miles+" miles");
        }
    }
    
}