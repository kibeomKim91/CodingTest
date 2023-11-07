import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(n == 2006) {
            System.out.print("PetrSU, ITMO");
        } else if(n == 1996 || n == 1997 || n == 2000 || n == 2007 || n == 2008 ||
                 n == 2013 || n == 2018) {
            System.out.print("SPbSU");
        } else {
            System.out.print("ITMO");
        }
    }
    
}