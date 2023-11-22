import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int result = 0;
        
        for(int i=0; i<n; i++) {
            boolean bool = true;
            
            for(int j=0; j<m; j++) {
                int goal = sc.nextInt();
                
                if(goal == 0) {
                    bool = false;
                }
            }
            
            if(bool) {
                result++;
            }
        }
        
        System.out.print(result);
    }
    
}