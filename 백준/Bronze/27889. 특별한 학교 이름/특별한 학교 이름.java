import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        
        if(name.equals("NLCS")) {
            System.out.print("North London Collegiate School");
        } else if(name.equals("BHA")) {
            System.out.print("Branksome Hall Asia");
        } else if(name.equals("KIS")) {
            System.out.print("Korea International School");
        } else if(name.equals("SJA")) {
            System.out.print("St. Johnsbury Academy");
        }
    }
    
}