import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        
        if(a/(b*b) < 18.5) {
            System.out.print("Underweight");
        } else if(a/(b*b) >= 18.5 && a/(b*b) <= 25.0) {
            System.out.print("Normal weight");
        } else {
            System.out.print("Overweight");
        }
    }
    
}