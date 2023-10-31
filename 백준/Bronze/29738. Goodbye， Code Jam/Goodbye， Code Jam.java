import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++) {
            int a = sc.nextInt();
            
            if(a > 4500) {
                System.out.println("Case #"+i+": Round 1");
            } else if(a > 1000 && a <= 4500) {
                System.out.println("Case #"+i+": Round 2");
            } else if(a > 25 && a <= 1000) {
                System.out.println("Case #"+i+": Round 3");
            } else if(a <= 25) {
                System.out.println("Case #"+i+": World Finals");
            } 
        }
    }
    
}