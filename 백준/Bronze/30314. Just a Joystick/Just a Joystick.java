import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String a = sc.nextLine();
        String b = sc.nextLine();
        int count = 0;
        
        for(int i=0; i<n; i++) {
            int x = 0;
            
            if(a.charAt(i) < b.charAt(i)) {
                x = b.charAt(i) - a.charAt(i);
            } else if(a.charAt(i) > b.charAt(i)) {
                x = a.charAt(i) - b.charAt(i);
            }
            
            if(x > 26-x) {
                x = 26-x;
            }

            count += x;
        }
        
        System.out.print(count);
    }
    
}