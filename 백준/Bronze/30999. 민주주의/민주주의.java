import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int count = 0;
        
        for(int i=0; i<n; i++) {
            String str = sc.next();
            int o = 0;
            int x = 0;
            
            for(int j=0; j<m; j++) {
                if(str.charAt(j) == 'O') {
                    o++;
                } else {
                    x++;
                }
            }
            
            if(o > x) {
                count++;
            }
        }
        
        System.out.print(count);
    }
    
}