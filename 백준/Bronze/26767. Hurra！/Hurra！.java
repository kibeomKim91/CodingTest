import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++) {
            if(i%77 == 0) {
                System.out.println("Wiwat!");
            } else if(i%11 == 0) {
                System.out.println("Super!");
            } else if(i%7 == 0) {
                System.out.println("Hurra!");
            } else {
                System.out.println(i);
            }
        }
    }
    
}