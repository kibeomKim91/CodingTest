import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int h = sc.nextInt();
        int m = sc.nextInt();
        
        if(d*24*60+h*60+m < 16511) {
            System.out.print(-1);
        } else {
            System.out.print(d*24*60+h*60+m - 16511);
        }
    }
    
}