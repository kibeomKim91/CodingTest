import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;
        
        for(int i=0; i<n; i++) {
            int num = sc.nextInt();
            sum += x-num;
        }
        
        System.out.print(sum+x);
    }
    
}