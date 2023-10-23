import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        double xx = x;
        double yy = y;
        
        char grade;
        
        if(yy/2 > b) {
            grade = 'E';
        } else if(yy != b && yy/2 <= b) {
            grade = 'D';
        } else if(yy == b && xx/2 > a) {
            grade = 'C';
        } else if(xx != a && xx/2 <= a) {
            grade = 'B';
        } else {
            grade = 'A';
        }
        
        System.out.print(grade);
    }
    
}