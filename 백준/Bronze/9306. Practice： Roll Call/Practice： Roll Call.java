import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        
        for(int i=0; i<n; i++) {
            String a = sc.nextLine();
            String b = sc.nextLine();
            
            System.out.println("Case "+(i+1)+": "+b+", "+a);
        }
    }
    
}