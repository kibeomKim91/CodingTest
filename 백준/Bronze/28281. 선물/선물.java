import java.util.Scanner;
import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[] arr = new int[n];
        int arrLength = arr.length;
        
        for(int i=0; i<arrLength; i++) {
            arr[i] = sc.nextInt();
        }
        
        int[] array = new int[n-1];
        
        for(int i=0; i<arrLength-1; i++) {
            array[i] = arr[i] + arr[i+1];
        }
        
        Arrays.sort(array);
        System.out.print(array[0]*m);
    }
    
}