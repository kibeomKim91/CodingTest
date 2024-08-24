import java.util.Scanner;
import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int indexNum = 0;
        
        for(int i=0; i<n; i++) {
            String str = sc.next();
            arr[i] = (str.charAt(0)-'A')*20 + Integer.parseInt(str.substring(1));
        }
        
        Arrays.sort(arr);
        for(int i=1; i<=200; i++) {
            if(arr[indexNum]!=i) {
                System.out.print('.');
            } else {
                System.out.print('o');
                
                if(indexNum<n-1) {
                    indexNum++;
                }                
            }
            
            if(i%20==0) {
                System.out.println();
            }
        }
    }
    
}