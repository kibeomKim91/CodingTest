import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        
        for(int i=0; i<n; i++) {
            int num = sc.nextInt();
            
            if(num >= 7) {
                num = 7;
            }
            
            if(i%2 == 0) {
                sum += num - 2;
            } else {
                sum += num - 3;
            }
        }
        
        System.out.print(sum);
    }
    
}