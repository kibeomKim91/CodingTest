import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        
        for(int i=0; i<n; i++) {
            String str = sc.nextLine();
            int a = (str.charAt(0)-'0')*10 + str.charAt(1)-'0';
            int b = (str.charAt(2)-'0')*10 + str.charAt(3)-'0';
            
            if((a*a+b*b)%7 == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
    
}