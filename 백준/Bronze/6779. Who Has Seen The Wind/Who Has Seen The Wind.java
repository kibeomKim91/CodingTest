import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        
        for(int i=1; i<=m; i++) {
            if(-6*i*i*i*i+h*i*i*i+2*i*i+i <= 0) {
                System.out.print("The balloon first touches ground at hour: "+i);
                return;
            }
        }
        
        System.out.print("The balloon does not touch ground in the given time.");
    }
    
}