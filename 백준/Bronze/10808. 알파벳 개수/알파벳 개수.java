import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        int[] arr = new int[26];
        
        for(char ch : str.toCharArray()) {
            arr[ch - 'a']++;
        }
        
        for(int n : arr) {
            System.out.print(n + " ");
        }
    }
    
}