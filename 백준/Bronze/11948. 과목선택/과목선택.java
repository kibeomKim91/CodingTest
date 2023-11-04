import java.util.Scanner;
import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        
        for(int i=0; i<4; i++) {
            arr[i] = sc.nextInt();
        }
        
        int[] array = new int[2];
        
        for(int i=0; i<2; i++) {
            array[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);
        Arrays.sort(array);
        
        System.out.print(arr[1]+arr[2]+arr[3]+array[1]);
    }
    
}