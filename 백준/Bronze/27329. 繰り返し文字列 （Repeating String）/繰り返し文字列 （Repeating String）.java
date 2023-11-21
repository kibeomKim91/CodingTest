import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        String a = "";
        String b = "";
        
        for(int i=0; i<n/2; i++) {
            a += str.charAt(i);
        }
        
        for(int i=n/2; i<n; i++) {
            b += str.charAt(i);
        }
        
        if(a.equals(b)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
    
}