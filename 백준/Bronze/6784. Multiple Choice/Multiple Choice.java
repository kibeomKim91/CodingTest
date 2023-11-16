import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        char[] arr = new char[n];
        int count = 0;
        
        for(int i=0; i<n; i++) {
            arr[i] = sc.next().charAt(0);
        }
        
        for(int i=0; i<n; i++) {
            char ch = sc.next().charAt(0);
            if(ch == arr[i]) {
                count++;
            }
        }
        
        System.out.print(count);
    }
    
}