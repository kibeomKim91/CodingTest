import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int result = 0;
        
        for(int i=0; i<n; i++) {
            int b = sc.nextInt();
            
            if(i == 0) {
                a = b;
                continue;
            }
            
            if(a<b) {
                result += b-a;
            } else if(a>b) {
                a = b;
            }
        }
        
        System.out.print(result);
    }
    
}