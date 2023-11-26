import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        
        if(str.equals("freeze")) {
            if(a > b) {
                System.out.print(b);
            } else {
                System.out.print(a);
            }
        } else if(str.equals("heat")) {
            if(a > b) {
                System.out.print(a);
            } else {
                System.out.print(b);
            }
        } else if(str.equals("auto")) {
            System.out.print(b);
        } else if(str.equals("fan")) {
            System.out.print(a);
        } 
    }
    
}