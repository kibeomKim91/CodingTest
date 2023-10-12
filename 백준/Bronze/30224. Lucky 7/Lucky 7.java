import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        boolean contains7 = Integer.toString(n).contains("7");
        boolean divisibleBy7 = n % 7 == 0;
        
        if (!contains7 && !divisibleBy7) {
            System.out.println(0);
        } else if (!contains7 && divisibleBy7) {
            System.out.println(1);
        } else if (contains7 && !divisibleBy7) {
            System.out.println(2);
        } else { 
            System.out.println(3);
        }
    }
    
}