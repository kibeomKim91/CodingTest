import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        
        for(int i=0; i<k; i++) {
            int l = sc.nextInt();
            int n = sc.nextInt();
            int[] arr = new int[n];
            int count = 1;
            
            for(int j=0; j<n; j++) {
                arr[j] = sc.nextInt();
            }
            
            while(true) {
                if(arr[l-1]>0) {
                    count++;
                    l = arr[l-1];
                } else {
                    break;
                }
            }
            
            System.out.println("Data Set "+(i+1)+":");
            System.out.println(count);
            System.out.println();
        }
    }
    
}