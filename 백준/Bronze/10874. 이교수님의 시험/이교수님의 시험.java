import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++) {
            int count = 0;
            
            for(int j=1; j<=10; j++) {
                int num = sc.nextInt();
                
                if(num == (j-1)%5+1) {
                    count++;
                }
            }
            
            if(count == 10) {
                System.out.println(i);
            }
        }
    }
    
}