import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for(int i=0; i<t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] arr = new int[n];
            int max = 0;
            int winner = 0;
            
            for(int j=0; j<m; j++) {
                for(int k=0; k<n; k++) {
                    arr[k] += sc.nextInt();
                }
            }
            
            for(int j=0; j<n; j++) {
                if(arr[j] > max) {
                    max = arr[j];
                    winner = j+1;
                }
            }
            
            System.out.println(winner);
        }
    }
    
}