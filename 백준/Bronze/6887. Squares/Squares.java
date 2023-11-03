import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n = (int) Math.sqrt(n);
        
        System.out.print("The largest square has side length " + n + ".");
    }
    
}