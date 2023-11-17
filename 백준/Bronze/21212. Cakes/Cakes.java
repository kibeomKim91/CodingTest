import java.util.Scanner;
import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[i] = b/a;
        }
        
        Arrays.sort(arr);
        
        System.out.print(arr[0]);
    }
    
}