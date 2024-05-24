import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int strLength = str.length();
        int n = sc.nextInt();
        char[] arr = new char[strLength];
        
        for(int i=0; i<strLength; i++) {
            arr[i] = str.charAt(i);
        }
        
        for(int i=0; i<n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            char ch = arr[a];
            arr[a] = arr[b];
            arr[b] = ch;
        }
        
        for(int i=0; i<strLength; i++) {
            System.out.print(arr[i]);
        }
    }
    
}