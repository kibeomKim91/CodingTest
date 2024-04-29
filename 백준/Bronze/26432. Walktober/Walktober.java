import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for(int i=0; i<t; i++) {
            int sum = 0;
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();            
            int[][] arr = new int[a][b];
            
            for(int j=0; j<a; j++) {
                for(int k=0; k<b; k++) {
                    arr[j][k] = sc.nextInt();
                }
            }
            
            for(int j=0; j<b; j++) {
                int max = 0;
                
                for(int k=0; k<a; k++) {
                    if(arr[k][j] > max) {
                        max = arr[k][j];
                    }
                }
                
                if(max > arr[c-1][j]) {
                    sum += max-arr[c-1][j];
                }
            }
            
            System.out.println("Case #"+(i+1)+": "+sum);
        }
    }
    
}