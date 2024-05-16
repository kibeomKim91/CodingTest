import java.util.Scanner;
import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            
            if(n==0 && m==0) {
                break;
            }
            
            int[] arr = new int[n];
            for(int i=0; i<m; i++) {
                for(int j=0; j<n; j++) {
                    arr[j] += sc.nextInt();
                }
            }
            
            Arrays.sort(arr);
            System.out.println(arr[n-1]);
        }
    }
    
}