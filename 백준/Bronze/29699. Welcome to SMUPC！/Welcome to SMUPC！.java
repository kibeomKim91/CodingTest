import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = "WelcomeToSMUPC";
        
        if(n%14 == 0) {
            System.out.print(str.charAt(str.length()-1));
        } else {
            System.out.print(str.charAt(n%14-1));
        }
    }
    
}