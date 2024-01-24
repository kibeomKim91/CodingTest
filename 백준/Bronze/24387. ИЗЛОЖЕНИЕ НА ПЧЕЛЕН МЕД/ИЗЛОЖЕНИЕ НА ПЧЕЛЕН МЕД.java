import java.util.Scanner;
import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] price = new long[3];
        price[0] = sc.nextLong();
        price[1] = sc.nextLong();
        price[2] = sc.nextLong();
        
        long[] container = new long[3];
        container[0] = sc.nextLong();
        container[1] = sc.nextLong();
        container[2] = sc.nextLong();
        
        Arrays.sort(price);
        Arrays.sort(container);
        
        long result = price[0]*container[0] + price[1]*container[1] + price[2]*container[2];
        System.out.print(result);
    }
    
}