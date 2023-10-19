import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        
        System.out.print(100/(n*1.609344/3.785411784));
    }
    
}