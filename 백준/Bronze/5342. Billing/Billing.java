import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d = 0.0;
        
        while(true) {
            String str = sc.nextLine();
            
            if(str.equals("EOI")) {
                break;
            }
            
            if(str.equals("Paper")) {
                d += 57.99;
            } else if(str.equals("Printer")) {
                d += 120.50;
            } else if(str.equals("Planners")) {
                d += 31.25;
            } else if(str.equals("Binders")) {
                d += 22.50;
            } else if(str.equals("Calendar")) {
                d += 10.95;
            } else if(str.equals("Notebooks")) {
                d += 11.20;
            } else if(str.equals("Ink")) {
                d += 66.95;
            }
        }
        
        System.out.print("$"+d);
    }
    
}