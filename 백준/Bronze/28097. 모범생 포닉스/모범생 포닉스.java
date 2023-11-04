import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int hour = 0;
        
        for(int i=0; i<n; i++) {
            hour += sc.nextInt();
        }
        
        hour += 8*(n-1);
        System.out.print(hour/24 + " " + hour%24);
    }
    
}