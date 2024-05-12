import java.util.Scanner;
import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        int[] b = new int[5];
        int result = 0;
        
        for(int i=0; i<5; i++) {
            a[i] = sc.nextInt();
        }
        
        for(int i=0; i<5; i++) {
            b[i] = sc.nextInt();
        }
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        for(int i=0; i<5; i++) {
            if(a[i]>b[i]) {
                result++;
            }
        }
        
        System.out.print(result);
    }
    
}