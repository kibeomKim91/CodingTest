import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int strLength = str.length();
        int[] arr = new int[26];
        int a = 0;
        int b = 0;
        
        for(int i=0; i<strLength; i++) {
            arr[str.charAt(i) - 'a']++;
        }
        
        for(int i=0; i<26; i++) {
            if(arr[i]%2 == 1) {
                a++;
            } else if(arr[i] != 0 && arr[i]%2 == 0) {
                b++;
            }
        }
        
        if(a > 0 && b == 0) {
            System.out.print(1);
        } else if(a == 0 && b > 0) {
            System.out.print(0);
        } else {
            System.out.print(2);
        }
    }
    
}