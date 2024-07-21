import java.util.Scanner;
import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[26];
        sc.nextLine();
        String str = sc.nextLine();
        
        for(int i=0; i<n; i++) {
            char ch = str.charAt(i);
            if(ch-'a'>=0 && ch-'a'<=25) {
                arr[ch-'a']++;
            }
        }
        
        Arrays.sort(arr);
        System.out.print(arr[25]);
    }
    
}