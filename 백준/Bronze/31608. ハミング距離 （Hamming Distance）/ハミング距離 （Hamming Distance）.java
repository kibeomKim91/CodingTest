import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        String t = sc.next();
        int count = 0;
        
        for(int i=0; i<n; i++) {
            if(s.charAt(i) != t.charAt(i)) {
                count++;
            }
        }
        
        System.out.print(count);
    }
    
}