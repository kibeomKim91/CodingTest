import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        if(a+d == b+c) {
            if(b > d) {
                System.out.print("Esteghlal");
            } else if(d > b) {
                System.out.print("Persepolis");
            } else {
                System.out.print("Penalty");
            }
        } else if(a+d > b+c) {
            System.out.print("Persepolis");
        } else if(b+c > a+d) {
            System.out.print("Esteghlal");
        }
    }
    
}