import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        int first = (int) (a * b / c);
        int second = (int) (a / b * c);
        
        if(first >= second) {
            System.out.print(first);
        } else {
            System.out.print(second);
        }        
    }
    
}