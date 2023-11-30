import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;
        
        for(int i=0; i<n; i++) {
            int ww = sc.nextInt();
            int ll = sc.nextInt();
            
            sum += ww*ll;
        }
        
        System.out.print(sum/w);
    }
    
}