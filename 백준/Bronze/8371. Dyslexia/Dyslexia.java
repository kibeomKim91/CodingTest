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
            if(a.charAt(i) != b.charAt(i)) {
                count++;
            }
        }
        
        System.out.print(count);
    }
    
}