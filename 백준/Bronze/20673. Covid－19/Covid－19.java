import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        if(n <= 50 && m <= 10) {
            System.out.print("White");
        } else if(m > 30) {
            System.out.print("Red");
        } else {
            System.out.print("Yellow");
        }
    }
    
}