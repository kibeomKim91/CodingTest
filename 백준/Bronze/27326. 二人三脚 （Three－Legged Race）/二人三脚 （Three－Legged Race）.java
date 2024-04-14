import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0; i<2*n-1; i++) {
            int num = sc.nextInt();
            arr[num-1]++;
        }
        
        for(int i=0; i<n; i++) {
            if(arr[i] == 1) {
                System.out.print(i+1);
                break;
            }
        }
    }
    
}