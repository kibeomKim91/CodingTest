import java.util.Scanner;
import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[m];
        
        for(int i=0; i<n; i++) {
            int num = sc.nextInt()-1;
            arr[num]++;
        }
        
        Arrays.sort(arr);
        System.out.print(arr[m-1]);
    }
    
}