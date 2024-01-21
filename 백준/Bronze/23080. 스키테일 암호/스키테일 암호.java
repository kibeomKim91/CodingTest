import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        int strLength = str.length();
        
        for(int i=0; i<strLength; i++) {
            if(i % n == 0) {
                System.out.print(str.charAt(i));
            }
        }
    }
    
}