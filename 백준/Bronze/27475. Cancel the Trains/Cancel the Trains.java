import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for(int i=0; i<t; i++) {
            int count = 0;
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] nn = new int[n];
            int[] mm = new int[m];
            
            for(int j=0; j<n; j++) {
                nn[j] = sc.nextInt();
            }
            
            for(int j=0; j<m; j++) {
                mm[j] = sc.nextInt();
            }
            
            for(int a:nn) {
                for(int b:mm) {
                    if(a == b) {
                        count++;
                        break;
                    }
                }
            }
            
            System.out.println(count);
        }
    }
    
}