import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int score = 0;
        int[] arr = new int[26];
        
        for(int i=0; i<n; i++) {
            arr[str.charAt(i)-'A']++;
        }
        
        for(int i=0; i<26; i++) {
            if(arr[i]>0) {
                score += (i+1)*arr[i];
            }
        }
        
        System.out.print(score);
    }
    
}