import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        
        for(int i=0; i<n; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            
            if(max < h * w) {
                max = h * w;
            }
        }
        
        System.out.print(max);
    }
    
}