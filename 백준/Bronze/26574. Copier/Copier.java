import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int input = 0;
        
        for(int i=0; i<n; i++) {
            input = sc.nextInt();
            System.out.println(input + " " + input);
        }
    }
    
}