import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int height = sc.nextInt();
        int count = 0;
        
        for(int i=0; i<n; i++) {
            int minHeight = sc.nextInt();
            
            if(height >= minHeight) {
                count++;
            }
        }
        
        System.out.print(count);
    }
    
}