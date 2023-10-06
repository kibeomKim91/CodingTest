import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();
        sc.close();
        
        int price = 0;
        
        if(first == second && first == third) {
            price = 10000 + first * 1000;
        } else if(first == second && first != third) {
            price = 1000 + first * 100;
        } else if(second == third && second != first) {
            price = 1000 + second * 100;
        } else if(third == first && third != second) {
            price = 1000 + third * 100;
        } else if(first != second && first != third && second != third) {
            if(first > second && first > third) {
                price = first * 100;
            } else if(second > first && second > third) {
                price = second * 100;
            } else if(third > first && third > second) {
                price = third * 100;
            }
        }
        
        System.out.print(price);
    }
    
}