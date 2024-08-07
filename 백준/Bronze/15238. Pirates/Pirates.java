import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int[] arr = new int[26];
        int max = 0;
        int result = 0;
        
        for(int i=0; i<n; i++) {
            arr[str.charAt(i)-'a']++;
        }
        
        for(int i=0; i<26; i++) {
            if(arr[i]>max) {
                max = arr[i];
                result = i;
            }
        }
        
        System.out.print((char)(result+97)+" "+max);
    }
    
}