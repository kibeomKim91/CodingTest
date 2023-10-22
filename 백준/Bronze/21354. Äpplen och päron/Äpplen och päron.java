import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if(a*7 > b*13) {
            System.out.print("Axel");
        } else if(b*13 > a*7) {
            System.out.print("Petra");
        } else {
            System.out.print("lika");
        }
    }
    
}