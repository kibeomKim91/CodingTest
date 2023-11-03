import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        
        if(a > b+60) {
            sum = (a-(b+60))*3000 + (b+60)*1500;
        } else if(a <= b+60) {
            sum += a*1500;
        }
        
        System.out.print(sum);
    }
    
}