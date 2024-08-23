import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int min = 0;
        
        for(int i=0; i<n; i++) {
            int num = sc.nextInt();
            sum += num;
            
            if(sum<min) {
                min = sum;
            }
        }
        
        System.out.print(min*-1);
    }
    
}