import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        
        String[] arr = new String[n];
        
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextLine();
        }
        
        int m = sc.nextInt();
        
        for(int i=0; i<m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            for(int j=a-1; j<b; j++) {
                System.out.println(arr[j]);
            }
        }
    }
    
}