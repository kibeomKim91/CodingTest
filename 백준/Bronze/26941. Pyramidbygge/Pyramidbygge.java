import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int block = 1;
        int sum = 0;
        int high = 0;
        
        while(true) {
            sum += block * block;
            
            if(sum > n) {
                break;
            } else {
                high++;
            }
            
            block += 2;
        }
        
        System.out.print(high);
    }
    
}