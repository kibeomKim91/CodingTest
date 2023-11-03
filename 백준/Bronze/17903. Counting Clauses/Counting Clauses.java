import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        for(int i=0; i<x; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
        }
        
        if(x >= 8) {
            System.out.print("satisfactory");
        } else {
            System.out.print("unsatisfactory");
        }
    }
    
}