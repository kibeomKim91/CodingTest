import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++) {
            int m = sc.nextInt();
            int even = 0;
            int odd = 0;
            
            for(int j=0; j<m; j++) {
                int o = sc.nextInt();
                
                if(o%2 == 0) {
                    even += o;
                } else {
                    odd += o;
                }
            }
            
            if(even > odd) {
                System.out.println("EVEN");
            } else if(even < odd) {
                System.out.println("ODD");
            } else {
                System.out.println("TIE");
            }
        }
    }
    
}
