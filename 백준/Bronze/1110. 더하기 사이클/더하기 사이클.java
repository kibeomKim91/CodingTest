import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);        
        int num = in.nextInt();
        in.close();
        
        int count = 0;
        int firstNum = num;
        
        while(true) {
            num = num % 10 * 10 + (num / 10 + num % 10) % 10;
            count++;
            
            if(num == firstNum) {
                break;
            }
        }
        
        System.out.println(count);
    }
}