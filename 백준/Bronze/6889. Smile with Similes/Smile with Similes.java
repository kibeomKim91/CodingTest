import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[] nn = new String[n];
        String[] mm = new String[m];
        
        for(int i=0; i<n; i++) {
            nn[i] = sc.next();
        }
        
        for(int i=0; i<m; i++) {
            mm[i] = sc.next();
        }
        
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                System.out.println(nn[i]+" as "+mm[j]);
            }
        }
    }
    
}