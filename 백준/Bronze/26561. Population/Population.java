import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int people = 0;
        int second = 0;
        
        for(int i=0; i<n; i++) {
            people = sc.nextInt();
            second = sc.nextInt();
            
            System.out.println(people - second/7 + second/4);
        }
    }
    
}