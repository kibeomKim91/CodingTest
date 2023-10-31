import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(n%8 == 1) {
            System.out.print(1);
        } else if(n%8 == 0 || n%8 == 2) {
            System.out.print(2);
        } else if(n%8 == 3 || n%8 == 7) {
            System.out.print(3);
        } else if(n%8 == 4 || n%8 == 6) {
            System.out.print(4);
        } else if(n%8 == 5) {
            System.out.print(5);
        }
    }
    
}