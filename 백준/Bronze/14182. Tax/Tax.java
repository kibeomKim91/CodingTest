import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            int num = sc.nextInt();
            
            if(num == 0) {
                break;
            }
            
            if(num <= 1000000) {
                System.out.println(num);
            } else if(num > 1000000 && num <= 5000000) {
                System.out.println(num/10*9);
            } else {
                System.out.println(num/5*4);
            }
        }
    }
    
}