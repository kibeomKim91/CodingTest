import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        int strLength = str.length();
        
        StringBuilder sb = new StringBuilder(5);
        
        for(int i=0; i<5; i++) {
            sb.append(str.charAt(strLength-5+i));
        }
        
        System.out.print(sb.toString());
    }
    
}