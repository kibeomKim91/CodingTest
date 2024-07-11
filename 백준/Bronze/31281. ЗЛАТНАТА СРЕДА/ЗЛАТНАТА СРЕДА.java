import java.util.Scanner;
import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] arr = new long[3];
        
        for(int i=0; i<3; i++) {
            arr[i] = sc.nextLong();
        }
        
        Arrays.sort(arr);
        System.out.print(arr[1]);
    }
    
}