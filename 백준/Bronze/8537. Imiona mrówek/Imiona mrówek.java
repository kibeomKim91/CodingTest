import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        
        for(int i=0; i<n; i++) {
            String name = sc.next();
            int[] arr = new int[26];
            int nameLength = name.length();
            int count = 0;
            
            for(int j=0; j<nameLength; j++) {
                arr[name.charAt(j)-'a']++;
            }
            
            for(int j=0; j<26; j++) {
                if(arr[j]>0) {
                    count++;
                }
            }
            
            if(count>max) {
                max = count;
            }
        }
        
        System.out.print(max);
    }
    
}