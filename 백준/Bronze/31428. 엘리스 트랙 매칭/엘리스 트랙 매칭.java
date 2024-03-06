import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        char[] arr = new char[n];
        
        for(int i=0; i<n; i++) {
            arr[i] = sc.next().charAt(0);
        }
        
        char hellobit = sc.next().charAt(0);
        for(char ch : arr) {
            if(hellobit == ch) {
                count++;
            }
        }
        
        System.out.print(count);
    }
    
}