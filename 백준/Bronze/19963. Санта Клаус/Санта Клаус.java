import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0; i<a; i++) {
            int x = sc.nextInt();
            arr[x-1]++;
        }
        
        for(int i=0; i<b; i++) {
            int x = sc.nextInt();
            arr[x-1]++;
        }
        
        System.out.println(n-a-b);
        
        for(int i=0; i<n; i++) {
            if(arr[i] == 0) {
                System.out.print(i+1+" ");
            }
        }
    }
    
}