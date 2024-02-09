import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++) {
            int num = sc.nextInt();
            int a = num/5;
            int b = num%5;
            
            for(int j=0; j<a; j++) {
                System.out.print("++++ ");
            }
            
            for(int j=0; j<b; j++) {
                System.out.print("|");
            }
            
            System.out.println("");
        }
    }
    
}