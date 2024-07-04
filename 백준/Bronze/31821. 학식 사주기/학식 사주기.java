import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int m = sc.nextInt();
        for(int i=0; i<m; i++) {
            int num = sc.nextInt()-1;
            sum += arr[num];
        }
        
        System.out.print(sum);
    }

}