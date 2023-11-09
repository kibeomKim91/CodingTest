import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int copy = 100;
        int sum = 0;
        
        for(int i=0; i<n; i++) {
            int num = sc.nextInt();
            
            if(copy < num) {
                sum++;
            }
            
            copy = num;
        }
        
        System.out.print(sum);
    }
    
}