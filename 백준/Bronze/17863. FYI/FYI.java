import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(n/10000 == 555) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
    
}