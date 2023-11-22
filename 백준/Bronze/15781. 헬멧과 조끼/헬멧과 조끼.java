import java.util.Scanner;
import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[] helmetDefense = new int[n];
        int[] armorDefense = new int[m];
        
        for(int i=0; i<n; i++) {
            helmetDefense[i] = sc.nextInt();
        }
        
        for(int i=0; i<m; i++) {
            armorDefense[i] = sc.nextInt();
        }
        
        Arrays.sort(helmetDefense);
        Arrays.sort(armorDefense);
        
        System.out.print(helmetDefense[n-1] + armorDefense[m-1]);
    }
    
}