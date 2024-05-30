import java.util.Scanner;
import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] w = new int[10];
        int[] k = new int[10];
        
        for(int i=0; i<10; i++) {
            w[i] = sc.nextInt();
        }
        
        for(int i=0; i<10; i++) {
            k[i] = sc.nextInt();
        }
        
        Arrays.sort(w);
        Arrays.sort(k);
        System.out.print((w[7]+w[8]+w[9])+" "+(k[7]+k[8]+k[9]));
    }
    
}