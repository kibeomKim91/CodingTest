import java.util.Scanner;
import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[m];
        
        for(int i=0; i<n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            if(a == b) {
                arr[a-1]++;
            } else {
                for(int j=a-1; j<=b-1; j++) {
                    arr[j]++;
                }
            }
        }
        
        Arrays.sort(arr);
        
        if(arr[0] == 0) {
            System.out.print("NO");
        } else {
            System.out.print("YES");
        }
    }
    
}