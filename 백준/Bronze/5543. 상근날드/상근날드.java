import java.util.Scanner;
import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] burger = new int[3];
        int[] drink = new int[2];
        
        for(int i=0; i<3; i++) {
            burger[i] = sc.nextInt();
        }
        
        for(int i=0; i<2; i++) {
            drink[i] = sc.nextInt();
        }
        
        Arrays.sort(burger);
        Arrays.sort(drink);
        
        System.out.print(burger[0]+drink[0]-50);
    }
    
}