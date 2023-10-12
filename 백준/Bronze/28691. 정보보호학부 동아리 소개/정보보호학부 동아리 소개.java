import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        
        if(ch == 'M') {
            System.out.print("MatKor");
        } else if(ch == 'W') {
            System.out.print("WiCys");
        } else if(ch == 'C') {
            System.out.print("CyKor");
        } else if(ch == 'A') {
            System.out.print("AlKor");
        } else if(ch == '$') {
            System.out.print("$clear");
        }
    }
    
}