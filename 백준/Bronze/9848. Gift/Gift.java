import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int before = 0;
        int count = 0;
        
        for(int i=0; i<n; i++) {
            int after = sc.nextInt();
            
            if(before-after >= m) {
                count++;
            }
            
            before = after;
        }
        
        System.out.print(count);
    }
    
}