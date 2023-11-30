import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int n = sc.nextInt();
        int max = 0;
        
        for(int i=0; i<n; i++) {
            int sum = 0;
            
            for(int j=0; j<3; j++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                int z = sc.nextInt();
                
                sum += x*a+y*b+z*c;
            }
            
            if(sum > max) {
                max = sum;
            }
        }
        
        System.out.print(max);
    }
    
}