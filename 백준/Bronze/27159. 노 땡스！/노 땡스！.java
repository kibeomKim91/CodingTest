import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int copy = 0;
        int sum = 0;
        
        for(int i=0; i<n; i++) {
            int num = sc.nextInt();
            
            if(num != copy+1) {
                sum += num;
            }
            
            copy = num;
        }
        
        System.out.print(sum);
    }
    
}