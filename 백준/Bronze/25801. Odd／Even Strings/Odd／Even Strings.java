import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int strLength = str.length();
        int[] arr = new int[26];
        int odd = 0;
        int even = 0;
        
        for(int i=0; i<strLength; i++) {
            arr[str.charAt(i) - 'a']++;
        }
        
        for(int num : arr) {
            if(num%2 == 1) {
                odd++;
            } else if(num%2 == 0 && num > 0) {
                even++;
            }
        }
        
        if(odd > 0 && even == 0) {
            System.out.print(1);
        } else if(even > 0 && odd == 0) {
            System.out.print(0);
        } else {
            System.out.print("0/1");
        }
    }
    
}