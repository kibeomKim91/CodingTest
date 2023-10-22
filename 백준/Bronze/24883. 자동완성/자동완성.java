import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        
        if(ch == 'N' || ch == 'n') {
            System.out.print("Naver D2");
        } else {
            System.out.print("Naver Whale");
        }
    }
    
}