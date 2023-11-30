import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        
        for(int i=1; i<=n; i++) {
            int num = sc.nextInt();
            
            if(num-(n-i)-1 > max) {
                max = num-(n-i)-1;
            }
        }
        
        System.out.print(max);
    }
    
}