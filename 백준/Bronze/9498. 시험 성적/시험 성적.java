import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        
        if(num >= 90) {
            System.out.print('A');
        } else if(num <= 89 && num >= 80) {
            System.out.print('B');
        } else if(num <= 79 && num >= 70) {
            System.out.print('C');
        } else if(num <= 69 && num >= 60) {
            System.out.print('D');
        } else {
            System.out.print('F');
        }
    }
    
}