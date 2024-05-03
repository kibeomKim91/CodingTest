import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n = sc.nextInt();
        int[] nn = new int[n];
        
        for(int i=0; i<n; i++) {
            nn[i] = sc.nextInt();
        }
        
        int m = sc.nextInt();
        int[] mm = new int[m];
        
        for(int i=0; i<m; i++) {
            mm[i] = sc.nextInt();
        }
        
        for(int i=0; i<n; i++) {
            sum += nn[i];
            
            for(int j=0; j<m; j++) {
                if(sum == mm[j]) {
                    sum = 0;
                }
            }
        }
        
        System.out.print(sum);
    }
    
}